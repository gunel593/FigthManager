package org.example.Passenger.Repo;

import org.example.Fligth.Model.Entity.Fligth;
import org.example.Fligth.Repo.FligthMySQLRepoImpl;
import org.example.Passenger.Models.Entity.Passenger;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PassengerRepoImpl implements  PassengerRepo{
    private static final PassengerRepoImpl INSTANCE = new PassengerRepoImpl();

    private PassengerRepoImpl() {

    }

    public static PassengerRepoImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public List<Passenger> viewP() {
        try {
            Connection cn =getConnection();
            String query = "SELECT passengerId,name,age,contactInformation FROM fligth_data.passengers";
            Statement st = cn.createStatement();
            ResultSet resultSet=st.executeQuery(query);
            List<Passenger>passengerList= new ArrayList<>();
            while (resultSet.next()){
                long passengerId =resultSet.getInt("passengerId");
                String name = resultSet.getString("name");
                Integer age= resultSet.getInt("age");
                String contactInformation= resultSet.getString("contactInformation");

                Passenger passenger= new Passenger();
                passenger.setPassengerId(passengerId);
                passenger.setName(name);
                passenger.setAge(age);
                passenger.setContactInformation(contactInformation);
                passengerList.add(passenger);


            }
            cn.close();
            return passengerList;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();

        }
    }

    @Override
    public void addP(Passenger passenger) {
        try {
            Connection cn = getConnection();///? men connection yazanda eror verdi
            String query = "insert into Passengers(name,age,contactInformation) values (?,?,?);";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, passenger.getName());
            pst.setInt(2, passenger.getAge());
            pst.setString(3, passenger.getContactInformation());



            pst.executeUpdate();
            cn.close();

        } catch (Exception ex) {
            ex.printStackTrace();


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



    @Override
    public boolean updateP(Passenger passenger) {
        try {
            Connection cn = getConnection();
            String query = "update passengers p set p.name=?,p.age=? ,p.contactInformation =?where p.passengerId=?;";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, passenger.getName());
            pst.setInt(2,passenger.getAge());
            pst.setString(3, passenger.getContactInformation());
            pst.setLong(4,passenger.getPassengerId());



            pst.executeUpdate();


            cn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        }
    }

    @Override
    public void removeP(Passenger passenger) {
        try {
            Connection conn = getConnection();

            String query = "delete from fligth_data.passengers where passengerId=? ;";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1, passenger.getPassengerId());
            preparedStatement.executeUpdate();

            conn.close();
            return;

        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }
}
