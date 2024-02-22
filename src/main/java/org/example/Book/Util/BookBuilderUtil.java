package org.example.Book.Util;

import org.example.Book.Dto.RequestBook;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;

import java.util.Scanner;

public class BookBuilderUtil {
    private  void BookBuilderUtil(){

    }
    public static RequestBook requestCancel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter cancel passengerId:");
        Long passengerId = sc.nextLong();
        System.out.println("Please enter cancel FligthNumber:");
        Long FligthNumber = sc.nextLong();
        RequestBook requestBook = new RequestBook();
        requestBook.setPassengerId(passengerId);
        requestBook.setFlightNumber(FligthNumber);
        return requestBook;
    }

    public static RequestBook requestAllow(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter allow passengerId:");
        Long passengerId = sc.nextLong();
        System.out.println("Please enter allow FligthNumber:");
        Long FligthNumber = sc.nextLong();
        RequestBook requestBook = new RequestBook();
        requestBook.setPassengerId(passengerId);
        requestBook.setFlightNumber(FligthNumber);
        return requestBook;
    }

}
