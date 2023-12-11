package com.example.hidourifayrouzexblanc.DAO.Repositories;

import com.example.hidourifayrouzexblanc.DAO.Entities.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeroportRepository extends JpaRepository<Aeroport,Integer> {
}
