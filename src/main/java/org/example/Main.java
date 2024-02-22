package org.example;


import org.example.Book.Dto.RequestBook;
import org.example.Book.Util.BookBuilderUtil;
import org.example.Book.ControllerBook.ControllerBook;
import org.example.Fligth.Controller.FligthController;
import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Fligth.Model.Dto.FligthDto.Responce;
import org.example.Fligth.Util.FligthBuilderUtil;
import org.example.Passenger.Controller.PassengerController;
import org.example.Passenger.Models.PassengerDto.PassengerRequest;
import org.example.Passenger.Models.PassengerDto.PassengerResponce;
import org.example.Passenger.Util.PassengerBuilderUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final FligthController fligthController = new FligthController();
    private static final PassengerController passengerController = new PassengerController();
    private static final ControllerBook controllerBook = new ControllerBook();

    public static void main(String[] args) {
        while (true) {
            menu();
        }

    }

    private static void menu() {
        System.out.println("""
                -----------------------------
                Choose your process
                  1.Add fligth
                  2.Remove fligth
                  3.View fligth
                  4.Update fligth
                  5.Add Passenger
                  6.Remove Passenger
                  7.View Passenger
                  8.Update Passenger
                  9.Allow Booking
                  10.Cancel Booking
                 """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                AddFligth();
                System.out.println("success");
                break;
            case 2:
                RemoveFligth();
                System.out.println("success");
                break;
            case 3:
                ViewFligth();
                System.out.println("success");
                break;
            case 4:
                UpdateFligth();
                System.out.println("success");
                break;
            case 5:
                AddPassenger();
                System.out.println("success");
                break;

            case 6:
                RemovePassenger();
                System.out.println("success");
                break;
            case 7:
                ViewPassenger();
                System.out.println("success");
                break;
            case 8:
                UpdatePassenger();
                System.out.println("success");
                break;
            case 9:
                AllowBook();
                System.out.println("success");
                break;
            case 10:
                CancelBook();
                System.out.println("success");
                break;
            default:
                defaults();
                break;

        }
    }

    private static void AddFligth() {
        Request addRequest = FligthBuilderUtil.addRequest();
        fligthController.Add(addRequest);

    }

    private static void RemoveFligth() {
        Request removerequest = FligthBuilderUtil.removeFligth();
        fligthController.RemoveFligth(removerequest);
    }

    private static void UpdateFligth() {
        Request updateRequest = FligthBuilderUtil.updateFligth();
        fligthController.UpdateFligth(updateRequest);
    }

    private static void ViewFligth() {
        List<Responce> fligths = fligthController.ViewFligth();
        for (Responce fligt : fligths) {
            System.out.println(fligths.toString());

        }
    }

    private static void AddPassenger() {
        PassengerRequest addPassengerRequest = PassengerBuilderUtil.addPassengerRequest();
        passengerController.AddPassenger(addPassengerRequest);
    }

    private static void RemovePassenger() {
        PassengerRequest removePassengerRequest = PassengerBuilderUtil.removePassenger();
        passengerController.RemovePassenger(removePassengerRequest);
    }

    private static void UpdatePassenger() {
        PassengerRequest updateRequest = PassengerBuilderUtil.updatePassenger();
        passengerController.UpdatePassenger(updateRequest);
    }

    private static void ViewPassenger() {
        List<PassengerResponce> passengerResponces = passengerController.ViewPassenger();
        for (PassengerResponce passenger : passengerResponces) {
            System.out.println(passengerResponces.toString());

        }
    }
    private static void AllowBook() {
        RequestBook requestBook = BookBuilderUtil.requestAllow();
        controllerBook.AllowBook(requestBook);
    }
    private static void CancelBook() {
        RequestBook requestBook = BookBuilderUtil.requestCancel();
        controllerBook.CancelBook(requestBook);
    }

    private static void defaults() {
        System.out.println("Your choice is not true.Please choose again");
        menu();
    }
}