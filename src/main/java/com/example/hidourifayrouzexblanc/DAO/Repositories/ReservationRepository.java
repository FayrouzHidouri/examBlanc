package com.example.hidourifayrouzexblanc.DAO.Repositories;

import com.example.hidourifayrouzexblanc.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
