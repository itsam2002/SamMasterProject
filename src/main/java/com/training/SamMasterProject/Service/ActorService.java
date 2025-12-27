package com.training.SamMasterProject.Service;

import com.training.SamMasterProject.Component.Actor;
import com.training.SamMasterProject.Repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class ActorService {

    @Autowired
    Dao dao;

    public ArrayList<Actor> getActorList() throws SQLException, ClassNotFoundException {
        return dao.getActors();
    }

    public String saveActor(Actor actor) throws SQLException, ClassNotFoundException {
        return dao.insertActor(actor);
    }
}
