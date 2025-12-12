package com.training.SamMasterProject.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Friends {

    @PostConstruct
    public void init(){
        System.out.println("Initialization Started for Friends Class");
        friends = new ArrayList<String>();
        friends.add("Sam");
        friends.add("Dipi");
        friends.add("Vraj");
        friends.add("Jiyaan");
    }

    List<String> friends;

    public List<String> getFriends(){
        return friends;
    }

    public int sizeOfFriends(){
        return friends.size();
    }

    public List<String> addFriends(String name){
        friends.add(name);
        return friends;
    }

    @PreDestroy
    public void destroy(){
        friends.clear();
    }
}
