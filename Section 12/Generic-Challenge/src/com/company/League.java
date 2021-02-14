package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean add(T team){
        if(this.teams.contains(team)){
            System.out.println(team.getName() + " already in league");
            return false;
        }

        this.teams.add(team);
        System.out.println(team.getName() + " team added successfully in league");
        return true;
    }

    public void printRank(){
        Collections.sort(this.teams);

        for(T t : this.teams){
            System.out.println(t.getName() + " : " + t.getScore());
        }
    }
}
