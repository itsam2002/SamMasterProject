package com.training.SamMasterProject.controller;

import com.training.SamMasterProject.component.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {

    @Autowired
    Friends friends;

    @GetMapping("/friends")
    public List<String> listFriends(){
        return friends.getFriends();
    }

    @GetMapping("/friends/size")
    public int sizeFriends(){
        return friends.sizeOfFriends();
    }

    @RequestMapping("/friends/add")
    public List<String> addFriends(@RequestParam String name){
        friends.addFriends(name);
        return friends.getFriends();
    }
}
