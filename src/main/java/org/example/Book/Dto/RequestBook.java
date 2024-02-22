package org.example.Book.Dto;

import org.example.Fligth.Model.Entity.Fligth;
import org.example.Passenger.Models.Entity.Passenger;

import java.util.Objects;

public class RequestBook {

    private Long FlightNumber;
    private long passengerId;

    @Override
    public String toString() {
        return "RequestBook{" +
                "FlightNumber=" + FlightNumber +
                ", passengerId=" + passengerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestBook that = (RequestBook) o;
        return passengerId == that.passengerId && Objects.equals(FlightNumber, that.FlightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FlightNumber, passengerId);
    }

    public Long getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        FlightNumber = flightNumber;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }
}
