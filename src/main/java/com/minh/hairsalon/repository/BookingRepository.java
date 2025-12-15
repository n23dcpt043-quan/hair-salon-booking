package com.minh.hairsalon.repository;

import com.minh.hairsalon.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("""
        SELECT b FROM Booking b
        WHERE (:date IS NULL OR b.startTime LIKE CONCAT(:date, '%'))
        AND (:stylist IS NULL OR b.stylistName = :stylist)
        AND (:status IS NULL OR b.status = :status)
    """)
    List<Booking> filterBookings(
            @Param("date") String date,
            @Param("stylist") String stylistName,
            @Param("status") String status
    );

    // 👇 THÊM DÒNG NÀY
    List<Booking> findByCustomerName(String customerName);
}

