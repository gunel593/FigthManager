package org.example.Fligth.Mapper;

import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Fligth.Model.Dto.FligthDto.Responce;

import org.example.Fligth.Model.Entity.Fligth;

import java.util.ArrayList;
import java.util.List;

public class MapperFlight {
    public Fligth toADDFligth(Request addrequest) {
        Fligth fligth = new Fligth();

        fligth.setDestination(addrequest.getDestination());
        fligth.setOrigin(addrequest.getOrigin());
        fligth.setTimes(addrequest.getTimes());
        fligth.setDepartureTime(addrequest.getDepartureTime());
        return fligth;
    }

    public static Fligth toUpdate(Request updateRequest) {
        Fligth fligth2 = new Fligth();
        fligth2.setFlightNumber(updateRequest.getFlightNumber());
        fligth2.setOrigin(updateRequest.getOrigin());
        fligth2.setDestination(updateRequest.getDestination());
        fligth2.setDepartureTime(updateRequest.getDepartureTime());
        fligth2.setTimes(updateRequest.getTimes());
        return fligth2;
    }

    public static Fligth toRemove(Request removerequest) {
        Fligth fligth1 = new Fligth();
        fligth1.setFlightNumber(removerequest.getFlightNumber());
        return fligth1;
    }

    public List<Responce> toViewResponceList(List<Fligth> fligthList) {
        List<Responce> responceList = new ArrayList<>();
        for (Fligth fligth : fligthList) {
            Responce responce = new Responce();
            responce.setFlightNumber(fligth.getFlightNumber());
            responce.setOrigin(fligth.getOrigin());
            responce.setDestination(fligth.getDestination());
            responce.setDepartureTime(fligth.getDepartureTime());
            responce.setTimes(fligth.getTimes());


            responceList.add(responce);
        }
        return responceList;
    }


}
