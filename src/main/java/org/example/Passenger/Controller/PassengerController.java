package org.example.Passenger.Controller;



import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;
import org.example.Passenger.Models.PassengerDto.PassengerResponce;
import org.example.Passenger.Servis.PassengerServis;

import java.util.List;


    public class PassengerController
        {
           private final PassengerServis passengerServis= new PassengerServis();
            public void UpdatePassenger(PassengerRequest updatePasrequest){
                passengerServis.  UpdatePassenger(updatePasrequest);
            }
            public void AddPassenger(PassengerRequest addPasrequest){
            passengerServis.AddPassenger(addPasrequest);
        }

            public void RemovePassenger(PassengerRequest removePasrequest){
            passengerServis.RemovePassenger(removePasrequest);
        }

         public List<PassengerResponce> ViewPassenger(){
        return passengerServis.ViewPassenger();
            }
    }


