package org.example.Book.Repo;

import org.example.Book.Entity.Book;
import org.example.Passenger.Repo.PassengerRepoImpl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookRepoMYSqlImpl implements BookRpo{

    private static final BookRepoMYSqlImpl INSTANCE = new BookRepoMYSqlImpl();

    private BookRepoMYSqlImpl() {

    }

    public static BookRepoMYSqlImpl getInstance() {
        return INSTANCE;
    }




    @Override
    public void cancel(Book book) {
        try {
            Connection conn = getConnection();

            String query = "delete from books where FligthNumber=? and passengerId =?;";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1,book.getFlightNumber());
            preparedStatement.setObject(2,book.getPassengerId());
            preparedStatement.executeUpdate();

            conn.close();
            return;

        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }

    @Override
    public void allow(Book book) {

        try {
            Connection conn = getConnection();

            String query = "insert into Books(passengerId,FligthNumber) values(?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1,book.getFlightNumber());
            preparedStatement.setLong(2,book.getPassengerId());
            preparedStatement.executeUpdate();

            conn.close();
            return;

        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fligth_data?useSSL=false";
            String username = "root";
            String password = "cehenemmeleyi01!";
            return DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("error");

        }
    }

    }

