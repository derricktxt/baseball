package com.bbsim.league;

public class Match{
    public final Team homeTeam;
    public final Team awayTeam;
    public final int month;
    public final int day;
    public final int year;
    public final String dayOfWeek;

    public Match(Team home, Team away, int month, int day, int year, String dayOfWeek){
	this.homeTeam = home;
	this.awayTeam = away;
	this.month = month;
	this.day = day;
	this.year = year;
	this.dayOfWeek = dayOfWeek;
    }
}
