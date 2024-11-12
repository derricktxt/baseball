package com.bbsim;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        GameData gameData = new GameData("src/main/resources/teams.csv");
	Scanner scanner = new Scanner(System.in);
	String userInput = "";
	while(!userInput.equals("q")){
	    System.out.println("What would you like to do?" );
	    userInput = scanner.nextLine();
	    if(userInput.equals("ls")){
		System.out.println("Please include group: " + 
				   "CL, ZL, PC, WC, SW, GP, MW, NE, EC, SE");
	    }
	    else if(userInput.contains("ls")){
		String group = userInput.split(" ")[1].trim().toUpperCase();
		gameData.list(group);
	    }
	    else if(userInput.contains("show")){
		String team = userInput.split(" ")[1].trim().toUpperCase();
		gameData.show(team);
	    }
	    else{
		System.out.println("UNKNOWN COMMAND");
	    }
	}
    }
}
