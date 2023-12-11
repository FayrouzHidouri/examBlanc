package com.example.hidourifayrouzexblanc.Services;

import com.example.hidourifayrouzexblanc.DAO.Entities.Aeroport;
import com.example.hidourifayrouzexblanc.DAO.Entities.ClassPlace;
import com.example.hidourifayrouzexblanc.DAO.Entities.Vol;
import com.example.hidourifayrouzexblanc.DAO.Entities.Voyageur;
import com.example.hidourifayrouzexblanc.DAO.Repositories.AeroportRepository;
import com.example.hidourifayrouzexblanc.DAO.Repositories.VolRepository;
import com.example.hidourifayrouzexblanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ExamenService implements IExamenService{

    private  AeroportRepository aeroportRepository;
    private  VolRepository volRepository;
    private VoyageurRepository voyageurRepositories;





    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        Aeroport aeroportDepart = vol.getAeroportDepart()
        Aeroport aeroportArrive = vol.getAeroportArrive();

        aeroportRepository.save(aeroportDepart);
        aeroportRepository.save(aeroportArrive);

        volRepository.save(vol);

        return "ajoutés avec succès.";
    }
    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepositories.saveAll(voyageurs);

    }
    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        Optional<Voyageur> voyageurOptional = voyageurRepositories.findById(int
        voyageurId);
        Optional<Vol> volOptional = volRepository.findById(int volId);
        if (voyageurOptional.isPresent() && volOptional.isPresent()) {
            Voyageur voyageur = voyageurOptional.get();
            Vol vol = volOptional.get();

            switch (classPlace) {
                case ECONOMIQUE:
                    break;
                case BUSINESS:
                    break;
                default:
                    return "non valide";
            }
            voyageurRepositories.save(voyageur);
            volRepository.save(vol);
            return "Réservation effectuée avec succès.";
        } else {
            return "Voyageur ou vol non trouvé.";
        }
}








