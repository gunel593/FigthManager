package org.example.Fligth.Model.Dto.FligthDto;

import java.time.LocalDate;
import java.util.Objects;

public class Responce {
    private Long FlightNumber;
    private String Origin;
    private String Destination;
    private LocalDate DepartureTime;
    private Integer Times;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Responce responce = (Responce) o;
        return Objects.equals(FlightNumber, responce.FlightNumber) && Objects.equals(Origin, responce.Origin) && Objects.equals(Destination, responce.Destination) && Objects.equals(DepartureTime, responce.DepartureTime) && Objects.equals(Times, responce.Times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FlightNumber, Origin, Destination, DepartureTime, Times);
    }

    @Override
    public String toString() {
        return "Responce{" +
                "FlightNumber=" + FlightNumber +
                ", Origin='" + Origin + '\'' +
                ", Destination='" + Destination + '\'' +
                ", DepartureTime=" + DepartureTime +
                ", Times=" + Times +
                '}';
    }

    public Long getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public LocalDate getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        DepartureTime = departureTime;
    }

    public Integer getTimes() {
        return Times;
    }

    public void setTimes(Integer times) {
        Times = times;
    }
}
