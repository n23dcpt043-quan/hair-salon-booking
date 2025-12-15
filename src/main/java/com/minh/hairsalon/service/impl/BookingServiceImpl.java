package com.minh.hairsalon.service.impl;

import com.minh.hairsalon.dto.BookingAdminDTO;
import com.minh.hairsalon.entity.Booking;
import com.minh.hairsalon.repository.BookingRepository;
import com.minh.hairsalon.service.BookingService;
import org.springframework.stereotype.Service;
import com.minh.hairsalon.entity.BookingStatus;


import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<BookingAdminDTO> getAll(String date, Long stylistId, String status) {

        List<Booking> list = bookingRepository.findAll();

        return list.stream()
                .map(b -> new BookingAdminDTO(
                        b.getId(),
                        b.getCustomerName(),
                        b.getServiceName(),
                        b.getStylistName(),
                        null,
                        null,
                        b.getStatus()
                ))
                .toList();
    }

    @Override
    public void updateStatus(Long bookingId, String status) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        BookingStatus bookingStatus;
        try {
            bookingStatus = BookingStatus.valueOf(status);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid status");
        }

        booking.setStatus(bookingStatus.name());
        bookingRepository.save(booking);
    }
}
