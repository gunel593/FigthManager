package org.example.Fligth.Repo;

import org.example.Fligth.Model.Entity.Fligth;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FligthMySQLRepoImpl implements FligthRepo {
    private static final FligthMySQLRepoImpl INSTANCE = new FligthMySQLRepoImpl();

    private FligthMySQLRepoImpl() {

    }

    public static FligthMySQLRepoImpl getInstance() {
        return INSTANCE;
    }


    @Override
    public List<Fligth> view() {
        try {
            Connection cn =getConnection();
            String query = "SELECT FligthNumber,Origin,Destination,DepartureTime,Times FROM fligth_data.fligths;";
            Statement st = cn.createStatement();
            ResultSet resultSet=st.executeQuery(query);
            List<Fligth>fligthList= new ArrayList<>();
            while (resultSet.next()){
                long FligthNumber =resultSet.getInt("FligthNumber");
                String Origin = resultSet.getString("Origin");
                String Destination = resultSet.getString("Destination");
                String DepartureTime= resultSet.getString("DepartureTime");
                int Times = resultSet.getInt("Times");
                Fligth fligth= new Fligth();
                fligth.setFlightNumber(FligthNumber);
                fligth.setOrigin(Origin);
                fligth.setDestination(Destination);
                fligth.setDepartureTime(LocalDate.parse(DepartureTime));
                fligth.setTimes(Times);
                fligthList.add(fligth);


            }
            cn.close();
            return fligthList;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();

        }
    }

    @Override
    public void add(Fligth fligth) {
        try {
            Connection cn = getConnection();///? men connection yazanda eror verdi
            String query = "insert into Fligths(Origin,Destination,DepartureTime,Times) values(?,?,?,?);";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, fligth.getOrigin());
            pst.setString(2, fligth.getDestination());
            pst.setString(3, String.valueOf(fligth.getDepartureTime()));
            pst.setInt(4, fligth.getTimes());

            pst.executeUpdate();
            cn.close();

        } catch (Exception ex) {
            ex.printStackTrace();


        }
    }

    @Override
    public boolean update(Fligth fligth) {
        try {
            Connection cn = getConnection();
            String query = "update fligths f set f.Origin=?,f.Destination=?,f.DepartureTime=?,f.Times=? where f.FligthNumber=?;";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setLong(1,fligth.getFlightNumber());
            pst.setString(2, fligth.getOrigin());
            pst.setString(3, fligth.getDestination());
            pst.setString(4, String.valueOf(fligth.getDepartureTime()));
            pst.setInt(5,fligth.getTimes());
            pst.executeUpdate();
            cn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        }
    }

    @Override
    public void remove(Fligth fligth) {
        try {
            Connection conn = getConnection();

            String query = "delete from fligth_data.fligths where FligthNumber=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1,fligth.getFlightNumber());

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


