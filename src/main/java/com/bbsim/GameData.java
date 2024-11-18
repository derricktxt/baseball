package com.bbsim;

import com.bbsim.league.Teams;
import com.bbsim.league.Team;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class GameData{

    private Teams copperLeague = new Teams("COPPER LEAGUE");
    private Teams zincLeague = new Teams("ZINC LEAGUE");

    private Teams pacificCoast = new Teams("PACIFIC COAST");
    private Teams westCentral = new Teams("WEST CENTRAL");
    private Teams greatPlains = new Teams("GREAT PLAINS");
    private Teams southWest = new Teams("SOUTHWEST");

    private Teams southEast = new Teams("SOUTHEAST");
    private Teams northEast = new Teams("NORTHEAST");
    private Teams eastCentral = new Teams("EAST CENTRAL");
    private Teams midwest = new Teams("MIDWEST");
    
    private int id = 1;
    public GameData(String filename){
        try{
	    Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()){
		processLine(scanner.nextLine().split(","));
	    }
	    
        } catch (IOException e){
            System.err.println("GAMEDATA.JAVA :: Filename " + filename + " not found");
	    e.printStackTrace();
        }
    }

    private void processLine(String[] line){
	Team team = new Team(line[2],line[3],line[4],line[5],line[6],line[0],line[1],id++);
	if(line[0].charAt(0) == 'C'){
	    copperLeague.add(team);
	    addCopperDivision(team, line[1]);
	}
	else{
	    zincLeague.add(team);
	    addZincDivision(team, line[1]);
	}
    }

    private void addCopperDivision(Team team, String division){
	if(division.equals("PC")){
	    pacificCoast.add(team);
	}
	else if(division.equals("WC")){
	    westCentral.add(team);
	}
	else if(division.equals("SW")){
	    southWest.add(team);
	}
	else{
	    greatPlains.add(team);
	}
    }

    private void addZincDivision(Team team, String division){
	if(division.equals("NE")){
	    northEast.add(team);
	}
	else if(division.equals("SE")){
	    southEast.add(team);
	}
	else if(division.equals("EC")){
	    eastCentral.add(team);
	}
	else{
	    midwest.add(team);
	}
    }

    public void list(String group){
	switch(group){
	  case "CL":
	    System.out.println(copperLeague);
	    break;
	  case "ZL":
	    System.out.println(zincLeague);
	    break;
	  case "PC":
	    System.out.println(pacificCoast);
	    break;
	  case "WC":
	    System.out.println(westCentral);
	    break;
	  case "GP":
	    System.out.println(greatPlains);
	    break;
	  case "SW":
	    System.out.println(southWest);
	    break;
	  case "MW":
	    System.out.println(midwest);
	    break;
	  case "NE":
	    System.out.println(northEast);
	    break;
	  case "SE":
	    System.out.println(southEast);
	    break;
	  case "EC":
	    System.out.println(eastCentral);
	    break;
	  default:
	    System.out.println("Unknown group");
	    System.out.println("CL, ZL, PC, WC, SW, GP, MW, NE, EC, SE");
	}
    }

    public void show(String teamCode){
	if(copperLeague.contains(teamCode)){
	    System.out.println(copperLeague.get(teamCode));
	}
	else if(zincLeague.contains(teamCode)){
	    System.out.println(zincLeague.get(teamCode));
	}
	else{
	    System.out.println("NOT FOUND");
	}
    }

}
