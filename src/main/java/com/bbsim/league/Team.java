package com.bbsim.league;

public class Team{

    public final String abbreviation, name, city, state, nickname;


    public Team(String abbreviation, String name, String city, String state, String nickname){
        this.abbreviation = abbreviation;
        this.name = name;
        this.city = city;
        this.state = state;
        this.nickname = nickname;
    }

    public String toString(){
        return String.format("+--------------------------+\n" +
			     "|%s%23s|\n" +
			     "|%-26s|\n" +
			     "|%26s|\n" +
                             "|%26s|\n" +
			     "+--------------------------+",
			     abbreviation," ", name,city,state);
    }

    public boolean equals(String otherAbbreviation){
	return abbreviation.equals(otherAbbreviation);
    }

}
