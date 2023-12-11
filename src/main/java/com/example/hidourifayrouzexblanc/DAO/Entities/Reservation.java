package com.example.hidourifayrouzexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {

    @Id
    private String idReservation ;
    private Date dateReservation;
    @Enumerated(EnumType.STRING)
    private  ClassPlace classPlace;
    @Enumerated(EnumType.STRING)
    private EtatReservation etatReservation;

    @ManyToOne(cascade = CascadeType.ALL)
    Vol vol;

    @ManyToOne(cascade = CascadeType.ALL)
    Voyageur voyageur;

}
