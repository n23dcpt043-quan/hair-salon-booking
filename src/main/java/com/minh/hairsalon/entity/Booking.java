package com.minh.hairsalon.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String serviceName;
    private String stylistName;
    private String startTime;
    private String endTime;
    private String status;

    public Booking(Long id, String customerName, String serviceName, String stylistName, String startTime, String endTime, String status) {
        this.id = id;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.stylistName = stylistName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Booking() {
    }

    public static BookingBuilder builder() {
        return new BookingBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getStylistName() {
        return this.stylistName;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Booking)) return false;
        final Booking other = (Booking) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$customerName = this.getCustomerName();
        final Object other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
            return false;
        final Object this$serviceName = this.getServiceName();
        final Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName))
            return false;
        final Object this$stylistName = this.getStylistName();
        final Object other$stylistName = other.getStylistName();
        if (this$stylistName == null ? other$stylistName != null : !this$stylistName.equals(other$stylistName))
            return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Booking;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $customerName = this.getCustomerName();
        result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
        final Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final Object $stylistName = this.getStylistName();
        result = result * PRIME + ($stylistName == null ? 43 : $stylistName.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "Booking(id=" + this.getId() + ", customerName=" + this.getCustomerName() + ", serviceName=" + this.getServiceName() + ", stylistName=" + this.getStylistName() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", status=" + this.getStatus() + ")";
    }

    public static class BookingBuilder {
        private Long id;
        private String customerName;
        private String serviceName;
        private String stylistName;
        private String startTime;
        private String endTime;
        private String status;

        BookingBuilder() {
        }

        public BookingBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public BookingBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public BookingBuilder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public BookingBuilder stylistName(String stylistName) {
            this.stylistName = stylistName;
            return this;
        }

        public BookingBuilder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public BookingBuilder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public BookingBuilder status(String status) {
            this.status = status;
            return this;
        }

        public Booking build() {
            return new Booking(this.id, this.customerName, this.serviceName, this.stylistName, this.startTime, this.endTime, this.status);
        }

        public String toString() {
            return "Booking.BookingBuilder(id=" + this.id + ", customerName=" + this.customerName + ", serviceName=" + this.serviceName + ", stylistName=" + this.stylistName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ")";
        }
    }
}