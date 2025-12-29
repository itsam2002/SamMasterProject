package com.training.SamMasterProject.Controller;

import com.training.SamMasterProject.Component.Actor;
import com.training.SamMasterProject.Service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class MyController {

    @Autowired
    ActorService actorService;

    @GetMapping("/actors")
    public ArrayList<Actor> getActors() throws SQLException, ClassNotFoundException {
        return actorService.getActorList();
    }

    @GetMapping("/actors/{actor_id}")
    public Actor getActor(@PathVariable int actor_id) throws SQLException, ClassNotFoundException {
        return actorService.getActor(actor_id);
    }

    @PostMapping("/postactor")
    public String postActor(@RequestBody Actor actor) throws SQLException, ClassNotFoundException {
        return actorService.saveActor(actor);
    }

    @PutMapping("/actors/{last_name}/{actor_id}")
    public String updateActor(@PathVariable String last_name, @PathVariable int actor_id) throws SQLException, ClassNotFoundException {
        String msg = actorService.updateActor(last_name, actor_id);
        return msg;
    }

    @PutMapping("/actors")
    public String updateActorAll(@RequestBody Actor actor) throws SQLException, ClassNotFoundException {
        String updatemsg = actorService.updateActorAll(actor);
        return updatemsg;
    }

    @DeleteMapping("/actors/{actor_id}")
    public String deleteActor(@PathVariable int actor_id) throws SQLException, ClassNotFoundException {
        String delmsg = actorService.deleteActor(actor_id);
        return delmsg;
    }
}
