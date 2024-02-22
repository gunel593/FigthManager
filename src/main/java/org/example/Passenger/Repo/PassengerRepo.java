package org.example.Passenger.Repo;

import org.example.Fligth.Model.Entity.Fligth;
import org.example.Passenger.Models.Entity.Passenger;

import java.util.List;

public interface PassengerRepo {
    List<Passenger> viewP();
    void addP(Passenger passenger);
    boolean updateP(Passenger passenger);
    void removeP(Passenger passenger );

}
