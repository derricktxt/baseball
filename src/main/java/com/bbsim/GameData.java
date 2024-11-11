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

	System.out.println(copperLeague);
	System.out.println(zincLeague);
	System.out.println(pacificCoast);
	System.out.println(westCentral);
	System.out.println(greatPlains);
	System.out.println(southWest);
	System.out.println(midwest);
	System.out.println(northEast);
	System.out.println(southEast);
	System.out.println(eastCentral);

    }

    private void processLine(String[] line){
	Team team = new Team(line[2],line[3],line[4],line[5],line[6]);
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

}
