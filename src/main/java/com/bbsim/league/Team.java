package com.bbsim.league;

public class Team{

    private final String abbreviation, name, city, state, nickname;


    public Team(String abbreviation, String name, String city, String state, String nickname){
        this.abbreviation = abbreviation;
        this.name = name;
        this.city = city;
        this.state = state;
        this.nickname = nickname;
    }

    public String toString(){
        return abbreviation;
    }

}
