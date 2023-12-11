package com.example.hidourifayrouzexblanc.DAO.Repositories;

import com.example.hidourifayrouzexblanc.DAO.Entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol,Integer> {
}
