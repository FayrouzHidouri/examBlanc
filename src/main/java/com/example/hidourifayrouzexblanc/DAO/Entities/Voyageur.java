package com.example.hidourifayrouzexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Voyageur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVoyageur;
    private String nom;
    private String prenom;
    private Date dateNaissance ;

    @OneToMany(mappedBy = "voyageur")
    private Set<Reservation> reservations;
}
