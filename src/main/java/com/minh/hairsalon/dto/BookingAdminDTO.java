package com.minh.hairsalon.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class BookingAdminDTO {

    private Long id;
    private String customerName;
    private String serviceName;
    private String stylistName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;

    public BookingAdminDTO() {}

    public BookingAdminDTO(
            Long id,
            String customerName,
            String serviceName,
            String stylistName,
            LocalDateTime startTime,
            LocalDateTime endTime,
            String status
    ) {
        this.id = id;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.stylistName = stylistName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
}
