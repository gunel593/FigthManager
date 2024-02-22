package org.example.Passenger.Util;

import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;

import java.time.LocalDate;
import java.util.Scanner;

public class PassengerBuilderUtil {
    private void PassengerBuilderUtil() {
    }

    public static PassengerRequest addPassengerRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter passengerId:");
        Long passengerId = sc.nextLong();

        sc = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = sc.nextLine();

        System.out.println("Please enter age:");
        Integer age = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Please enter contactInformation:");
        String contactInformation = sc.nextLine();



        PassengerRequest addPassengerRequest = new PassengerRequest();
        addPassengerRequest.setPassengerId(passengerId);
        addPassengerRequest.setName(name);
        addPassengerRequest.setAge(age);
        addPassengerRequest.setContactInformation(contactInformation);
        return addPassengerRequest;
    }
    public static PassengerRequest removePassenger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter remove passengerId:");
        Long passengerId = sc.nextLong();
        PassengerRequest removeP = new PassengerRequest();
        removeP.setPassengerId(passengerId);
        return removeP;
    }
    public static PassengerRequest updatePassenger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter update passengerId:");
        Long passengerId = sc.nextLong();
        System.out.println("Please enter update name:");
        sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Please enter update age:");
        Integer age = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Please enter update contactInformation:");
        String contactInformation = sc.nextLine();
        PassengerRequest updateP = new PassengerRequest();
        updateP.setPassengerId(passengerId);
        updateP.setName(name);
        updateP.setAge(age);
        updateP.setContactInformation(contactInformation);
        return updateP;
    }

}
