package com.example.hidourifayrouzexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAeroport ;
    @Column(nullable = false)
    private String nom;
    private String codeAITA;
    private long telephone ;

    @OneToMany(mappedBy = "aeroportDepart")
    private Set<Vol> vols;

    @OneToMany(mappedBy = "aeroportArrive")
    private Set<Vol> volSet;


}
