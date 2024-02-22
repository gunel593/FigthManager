package org.example.Fligth.Model.Dto.FligthDto;

import java.time.LocalDate;
import java.util.Objects;

public class Request {
    private Long FlightNumber;
    private String Origin;
    private String Destination;
    private LocalDate DepartureTime;
    private Integer Times;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(FlightNumber, request.FlightNumber) && Objects.equals(Origin, request.Origin) && Objects.equals(Destination, request.Destination) && Objects.equals(DepartureTime, request.DepartureTime) && Objects.equals(Times, request.Times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FlightNumber, Origin, Destination, DepartureTime, Times);
    }

    @Override
    public String toString() {
        return "Request{" +
                "FlightNumber=" + FlightNumber +
                ", Origin='" + Origin + '\'' +
                ", Destination='" + Destination + '\'' +
                ", DepartureTime=" + DepartureTime +
                ", Times=" + Times +
                '}';
    }

    public void getTimes(int times) {
    }
}
