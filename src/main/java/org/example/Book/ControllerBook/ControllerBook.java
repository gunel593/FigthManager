package org.example.Book.ControllerBook;

import org.example.Book.Dto.RequestBook;
import org.example.Book.Servis.BookServis;

public class ControllerBook {
    private  final BookServis bookServis= new BookServis();
    public void AllowBook(RequestBook allowRequest){
        bookServis.allowBook(allowRequest);
    }
    public void CancelBook(RequestBook requestCancel){
        bookServis.cancelBook(requestCancel);
    }
}
