package org.example.Book.Servis;

import org.example.Book.Dto.RequestBook;
import org.example.Book.Entity.Book;
import org.example.Book.MapperBook.MapperBook;
import org.example.Book.Repo.BookRepoMYSqlImpl;
import org.example.Book.Repo.BookRpo;
import org.example.Passenger.Mapper.MapperPassenger;



public class BookServis {
    private final BookRpo bookRpo = BookRepoMYSqlImpl.getInstance();
    private final MapperPassenger mapperPassenger = new MapperPassenger();
    public  void cancelBook(RequestBook requestCancel){
        Book book= MapperBook.toCancel(requestCancel);
        bookRpo.cancel(book);
    }
    public  void allowBook(RequestBook requestAllow){
      Book book1= MapperBook.toAllow(requestAllow);
      bookRpo.allow(book1);
    }
}
