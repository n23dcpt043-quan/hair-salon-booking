package com.minh.hairsalon.service;

import com.minh.hairsalon.dto.BookingAdminDTO;
import java.util.List;

public interface BookingService {

    List<BookingAdminDTO> getAll(String date, Long stylistId, String status);

    void updateStatus(Long bookingId, String status);

    List<BookingAdminDTO> getByCustomer(String customerName);

}
