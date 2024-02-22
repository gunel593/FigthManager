package org.example.Passenger.Mapper;


import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Fligth.Model.Dto.FligthDto.Responce;
import org.example.Fligth.Model.Entity.Fligth;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;
import org.example.Passenger.Models.PassengerDto.PassengerResponce;
import org.example.Passenger.Models.Entity.Passenger;

import java.util.ArrayList;
import java.util.List;

public class MapperPassenger {
    public static Passenger toADDPassenger(PassengerRequest addPassengerRequest) {
        Passenger passenger = new Passenger();

        passenger.setPassengerId(addPassengerRequest.getPassengerId());
        passenger.setName(addPassengerRequest.getName());
        passenger.setAge(addPassengerRequest.getAge());
        passenger.setContactInformation(addPassengerRequest.getContactInformation());
        return passenger;
    }
    public static Passenger toUpdatePassenger (PassengerRequest updatePassengerRequest){
        Passenger passenger1= new Passenger();
        passenger1.setContactInformation(updatePassengerRequest.getContactInformation());
        passenger1.setName(updatePassengerRequest.getName());
        passenger1.setAge(updatePassengerRequest.getAge());
        passenger1.setPassengerId(updatePassengerRequest.getPassengerId());

        return passenger1;
    }

    public static Passenger toRemovePassenger(PassengerRequest removePassengerRequest) {
        Passenger passenger2= new Passenger();
        passenger2.setPassengerId(removePassengerRequest.getPassengerId());
        return passenger2;
    }

    public List<PassengerResponce> toViewResponceList(List<Passenger> passengerList) {
        List<PassengerResponce> responceList = new ArrayList<>();
        for (Passenger passenger : passengerList) {
            PassengerResponce passengerResponce = new PassengerResponce();
            passengerResponce.setPassengerId(passenger.getPassengerId());
            passengerResponce.setName(passenger.getName());
            passengerResponce.setAge(passenger.getAge());
            passengerResponce.setContactInformation(passenger.getContactInformation());



            responceList.add(passengerResponce);
        }
        return responceList;
    }

}


 