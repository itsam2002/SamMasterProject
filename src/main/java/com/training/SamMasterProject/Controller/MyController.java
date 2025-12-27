package com.training.SamMasterProject.Controller;

import com.training.SamMasterProject.Component.Actor;
import com.training.SamMasterProject.Service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
public class MyController {

    @Autowired
    ActorService actorService;

    @GetMapping("/actors")
    public String getActors(Model model) throws SQLException, ClassNotFoundException {
        model.addAttribute("Actors", actorService.getActorList());
        return "Actors"; //JSP page view
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
