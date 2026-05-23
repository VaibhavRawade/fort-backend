package com.example.fort.FortProject.service;
import org.springframework.stereotype.Service;

import com.example.fort.FortProject.dto.BookingRequest;
import com.example.fort.FortProject.entity.Booking;
import com.example.fort.FortProject.repo.BookingRepository;

@Service
public class BookingService {

    private final BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

    public void createBooking(BookingRequest request) {

        Booking booking = new Booking();

        booking.setFullName(request.getFullName());
        booking.setEmail(request.getEmail());
        booking.setPhone(request.getPhone());
        booking.setFortId(request.getFortId());
        booking.setNumberOfPeople(request.getNumberOfPeople());
        booking.setPackageType(request.getPackageType());
        booking.setTravelDate(request.getTravelDate());
        booking.setSpecialRequests(request.getSpecialRequests());

        repository.save(booking);
    }
}