package com.example.hidourifayrouzexblanc.RestControllers;


import com.example.hidourifayrouzexblanc.DAO.Entities.Aeroport;
import com.example.hidourifayrouzexblanc.DAO.Entities.Vol;
import com.example.hidourifayrouzexblanc.DAO.Entities.Voyageur;
import com.example.hidourifayrouzexblanc.Services.IExamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExamenRestController {

    IExamenService iExamenService;

    @PostMapping("/ajouter")
    public String ajouterVolEtAeroport(@RequestBody Vol vol) {
        return iExamenService.ajouterVolEtAeroport(vol);
    }


    @PostMapping("/addVoyageurs")
    List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs)
    {
        return iExamenService.ajouterVoyageurs(voyageurs);
    }
}
