package com.example.fort.FortProject.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fort.FortProject.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}