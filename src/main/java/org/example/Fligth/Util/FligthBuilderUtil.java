package org.example.Fligth.Util;

import com.sun.management.VMOption;
import org.example.Fligth.Model.Dto.FligthDto.Request;

import javax.lang.model.util.Elements;
import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class FligthBuilderUtil {
    private void FligthBuilderUtil() {
    }

    public static Request addRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter FlightNumber:");
        Long FlightNumber = sc.nextLong();

         sc = new Scanner(System.in);
        System.out.println("Please enter Origin:");
        String Origin = sc.nextLine();

        System.out.println("Please enter Destination:");
        String Destination = sc.nextLine();

        System.out.println("Please enter DepartureTime:");
        String DepartureTime = sc.nextLine();

        System.out.println("Please enter Times:");
        int Times = sc.nextInt();

        Request addRequest = new Request();
        addRequest.setFlightNumber(FlightNumber);
        addRequest.setOrigin(Origin);
        addRequest.setDestination(Destination);
        addRequest.setDepartureTime(LocalDate.parse(DepartureTime));
        addRequest.setTimes(Times);
        return addRequest;
    }
    public static Request removeFligth(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter remove FlightNumber:");
       Long FlightNumber = sc.nextLong();
       Request remove = new Request();
       remove.setFlightNumber(FlightNumber);
       return remove;
    }
    public static Request updateFligth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter update FlightNumber:");
        Long FlightNumber = sc.nextLong();
        sc =new Scanner(System.in);
        System.out.println("Please enter update Origin:");
        String Origin = sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("Please enter update Destination:");
        String Destination = sc.nextLine();
        System.out.println("Please enter update DepartureTime:");
        String DepartureTime = sc.nextLine();
        System.out.println("Please enter update Times:");
        Integer Times =sc.nextInt();
        Request update = new Request();
        update.setFlightNumber(FlightNumber);
        update.setOrigin(Origin);
        update.setDestination(Destination);
        update.setDepartureTime(LocalDate.parse(DepartureTime));
        update.setTimes(Times);
        return update;
    }

}