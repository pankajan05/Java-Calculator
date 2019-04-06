package com.company.v8.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseNumberRepository implements NumberRepository {
    Connection con;
    ResultSet re;
    Statement st;


    @Override
    public List<Double> read() {
        List<Double> inputNumber = new ArrayList<>();

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/numbers","root","");
            st = con.createStatement();
            re = st.executeQuery("SELECT * FROM number");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            while(re.next()) {
                inputNumber.add(re.getDouble(1));
                inputNumber.add(re.getDouble(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return inputNumber;
    }
}
