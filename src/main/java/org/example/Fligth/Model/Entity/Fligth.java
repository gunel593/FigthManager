package org.example.Fligth.Model.Entity;

import java.time.LocalDate;
import java.util.Objects;

public class Fligth  {
    public Long FlightNumber;
    public String Origin;
    public String Destination;
    public LocalDate DepartureTime;
    public Integer Times;

    @Override
    public String toString() {
        return "Figth{" +
                "FlightNumber=" + FlightNumber +
                ", Origin='" + Origin + '\'' +
                ", Destination='" + Destination + '\'' +
                ", DepartureTime=" + DepartureTime +
                ", Times=" + Times +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fligth figth = (Fligth) o;
        return Objects.equals(FlightNumber, figth.FlightNumber) && Objects.equals(Origin, figth.Origin) && Objects.equals(Destination, figth.Destination) && Objects.equals(DepartureTime, figth.DepartureTime) && Objects.equals(Times, figth.Times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FlightNumber, Origin, Destination, DepartureTime, Times);
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
