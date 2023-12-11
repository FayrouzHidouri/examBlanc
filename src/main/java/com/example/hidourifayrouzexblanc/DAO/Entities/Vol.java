package com.example.hidourifayrouzexblanc.DAO.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVol;
    private Date dateDepart;
    private Date dateArrive;


    @OneToMany(mappedBy = "vol")
    private Set<Reservation> reservations;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Aeroport aeroportDepart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Aeroport aeroportArrive;
}
