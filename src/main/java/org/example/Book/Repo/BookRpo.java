package org.example.Book.Repo;

import org.example.Book.Entity.Book;
import org.example.Passenger.Models.Entity.Passenger;



public interface BookRpo {
    void cancel(Book book);
    void allow (Book book);
}
