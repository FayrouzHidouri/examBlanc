package com.example.hidourifayrouzexblanc.DAO.Repositories;

import com.example.hidourifayrouzexblanc.DAO.Entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {
}
