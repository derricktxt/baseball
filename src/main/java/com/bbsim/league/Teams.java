package com.bbsim.league;

import java.util.ArrayList;

public class Teams{
    private ArrayList<Team> teams = new ArrayList<Team>();
    private String groupName = "";

    public Teams(){

    }

    public Teams(String name){
	groupName = name;
    }

    public void add(Team team){
	teams.add(team);
    }

    public String toString(){
        String toReturn = groupName + ": ";
        for(Team team : teams){
             toReturn += team.toString() + " ";
        }
        toReturn.substring(0,toReturn.length() - 1);
        return toReturn;
    }
}
