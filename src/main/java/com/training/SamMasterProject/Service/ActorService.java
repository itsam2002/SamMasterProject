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

    public String updateActor(String last_name, int actor_id) throws SQLException, ClassNotFoundException {
        return dao.updateActor(last_name, actor_id);
    }

    public String updateActorAll(Actor actor) throws SQLException, ClassNotFoundException {
        return dao.updateActorAll(actor);
    }

    public String deleteActor(int actor_id) throws SQLException, ClassNotFoundException {
        String deletemsg = dao.deleteActor(actor_id);
        return deletemsg;
    }
}
