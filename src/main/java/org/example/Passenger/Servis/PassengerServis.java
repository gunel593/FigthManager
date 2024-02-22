package org.example.Passenger.Servis;


import org.example.Fligth.Repo.FligthMySQLRepoImpl;
import org.example.Fligth.Repo.FligthRepo;
import org.example.Passenger.Mapper.MapperPassenger;
import org.example.Passenger.Repo.PassengerRepo;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;
import org.example.Passenger.Models.PassengerDto.PassengerResponce;
import org.example.Passenger.Models.Entity.Passenger;
import org.example.Passenger.Repo.PassengerRepoImpl;

import java.util.List;

public class PassengerServis {
    private final PassengerRepo passengerRepo =PassengerRepoImpl.getInstance();
    private final MapperPassenger mapperPassenger = new MapperPassenger();

    public void AddPassenger(PassengerRequest addPassengerrequest) {
        Passenger passenger = MapperPassenger.toADDPassenger(addPassengerrequest);
             passengerRepo.addP(passenger);

    }
    public  void UpdatePassenger(PassengerRequest updatePassengerRequest){
        Passenger passenger1 = MapperPassenger.toUpdatePassenger(updatePassengerRequest);
        passengerRepo.updateP(passenger1);
    }
    public  void RemovePassenger(PassengerRequest removerePassengerrequest){
       Passenger passenger1 = MapperPassenger.toRemovePassenger(removerePassengerrequest);
        passengerRepo.removeP(passenger1);
    }
    public List<PassengerResponce> ViewPassenger(){
        List<Passenger>passengers = passengerRepo.viewP();
        return mapperPassenger.toViewResponceList(passengers);
    }

}
