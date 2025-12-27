package com.training.SamMasterProject.Controller;

import com.training.SamMasterProject.Component.Actor;
import com.training.SamMasterProject.Service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/postactor")
    public String postActor(@RequestBody Actor actor) throws SQLException, ClassNotFoundException {
        return actorService.saveActor(actor);
    }
}
