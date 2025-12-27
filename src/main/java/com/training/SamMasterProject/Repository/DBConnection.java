package com.training.SamMasterProject.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection DBConnect() throws ClassNotFoundException, SQLException {

        //Load DB Driver first
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish DB connection and store it in variable
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "springbootuser", "Jans1982#");

        return con;
    }
}
