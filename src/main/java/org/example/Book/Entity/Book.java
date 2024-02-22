package org.example.Book.Entity;

import org.example.Fligth.Model.Entity.Fligth;
import org.example.Passenger.Models.Entity.Passenger;

import java.util.Objects;

public class Book {
    private long bookId;
    private long FlightNumber;
    private long passengerId;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", FlightNumber=" + FlightNumber +
                ", passengerId=" + passengerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && FlightNumber == book.FlightNumber && passengerId == book.passengerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, FlightNumber, passengerId);
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        FlightNumber = flightNumber;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }
}
