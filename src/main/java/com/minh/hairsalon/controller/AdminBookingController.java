package com.minh.hairsalon.controller;

import com.minh.hairsalon.dto.BookingAdminDTO;
import com.minh.hairsalon.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/bookings")
public class AdminBookingController {

    private final BookingService bookingService;

    public AdminBookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<BookingAdminDTO> getAll(
            @RequestParam(required = false) String date,
            @RequestParam(required = false) Long stylistId,
            @RequestParam(required = false) String status
    ) {
        return bookingService.getAll(date, stylistId, status);
    }

    @PutMapping("/{id}/status")
    public void updateStatus(
            @PathVariable Long id,
            @RequestParam String status
    ) {
        bookingService.updateStatus(id, status);
    }

}
