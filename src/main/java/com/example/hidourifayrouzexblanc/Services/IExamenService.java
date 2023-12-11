package com.example.hidourifayrouzexblanc.Services;

import com.example.hidourifayrouzexblanc.DAO.Entities.ClassPlace;
import com.example.hidourifayrouzexblanc.DAO.Entities.Vol;
import com.example.hidourifayrouzexblanc.DAO.Entities.Voyageur;

import java.util.List;

public interface IExamenService {

    String ajouterVolEtAeroport(Vol vol);
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);

}
