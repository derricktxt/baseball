package com.bbsim.league;

public class Team{

    public final String ABBREVIATION, NAME, CITY, STATE, NICKNAME, LEAGUE, DIVISION;
    public final int ID;


    public Team(String abbreviation, String name, String city, String state, String nickname,
		String league, String division, int id){
        this.ABBREVIATION = abbreviation;
        this.NAME = name;
        this.CITY = city;
        this.STATE = state;
        this.NICKNAME = nickname;
	this.LEAGUE = league;
	this.DIVISION = division;
	this.ID = id;
    }

    public String toString(){
        return String.format("+--------------------------+\n" +
			     "|#%-25d|\n" +
			     "|%-26s|\n" +
			     "|%26s|\n" +
                             "|%26s|\n" +
			     "+--------------------------+",
			     ID,ABBREVIATION,NAME,CITY,STATE);
    }

    public boolean equals(String otherAbbreviation){
	return ABBREVIATION.equals(otherAbbreviation);
    }

}
