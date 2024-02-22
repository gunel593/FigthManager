package org.example.Book.MapperBook;

import org.example.Book.Dto.RequestBook;
import org.example.Book.Entity.Book;


public class MapperBook {
    public static Book toCancel(RequestBook requestCancel) {
        Book book1= new Book();
        book1.setPassengerId(requestCancel.getPassengerId());
        book1.setFlightNumber(requestCancel.getFlightNumber());

        return book1;
    }
    public static Book toAllow(RequestBook requestAllow) {
        Book book2= new Book();
        book2.setPassengerId(requestAllow.getPassengerId());
        book2.setFlightNumber(requestAllow.getFlightNumber());

        return book2;
    }
}
