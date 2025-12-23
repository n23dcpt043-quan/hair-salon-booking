package com.minh.hairsalon.controller;

import com.minh.hairsalon.dto.BookingAdminDTO;
import com.minh.hairsalon.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/me/bookings")
@CrossOrigin(origins = "*")
public class MeBookingController {

    private final BookingService bookingService;

    public MeBookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<BookingAdminDTO> myBookings() {
        // demo: giả lập user đang đăng nhập
        String customerName = "Minh";
        return bookingService.getByCustomer(customerName);
    }
}
