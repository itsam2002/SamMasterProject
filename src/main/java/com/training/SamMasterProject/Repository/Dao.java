package com.training.SamMasterProject.Repository;

import org.springframework.stereotype.Repository;

import com.training.SamMasterProject.Component.Actor;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.Class.forName;

@Repository
public class
Dao {

    public ArrayList<Actor> getActors() throws ClassNotFoundException, SQLException {

        ArrayList<Actor> actorlist = new ArrayList<Actor>();

        //Get it from DBConnection Class
        Connection con = DBConnection.DBConnect();

        //A Statement is used to send SQL queries to the database.
        Statement st = con.createStatement();

        //Retrive the data in the form of ResultSet
        ResultSet rs = st.executeQuery("SELECT * FROM sakila.actor");

        //To get one record at a time until finish
        while(rs.next()){
            int actor_id =  rs.getInt("actor_id");
            String actor_first_name = rs.getString("first_name");
            String actor_last_name = rs.getString("last_name");
            Date last_update = rs.getDate("last_update");

            Actor actor = new Actor(actor_id, actor_first_name, actor_last_name, last_update);

            actorlist.add(actor);
        }
        return actorlist;
    }

    public String insertActor(Actor actor) throws SQLException, ClassNotFoundException {

        //Get it from DBConnection Class
        Connection con = DBConnection.DBConnect();

        PreparedStatement pst = con.prepareStatement("INSERT INTO actor VALUES (?,?,?,?)");

        pst.setInt(1,actor.getActor_id());
        pst.setString(2,actor.getFirst_name());
        pst.setString(3,actor.getLast_name());
        pst.setDate(4,actor.getLast_update());

        pst.executeUpdate();

        return "Record has been inserted successfully";

    }
}

