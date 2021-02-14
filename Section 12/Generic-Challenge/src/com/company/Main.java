package com.company;

public class Main {

    public static void main(String[] args) {
	    FootballTeam arsenal = new FootballTeam("Arsenal");
	    FootballTeam barcelona = new FootballTeam("Barcelona");
	    FootballTeam chelsea = new FootballTeam("Chelsea");
	    FootballTeam realMadrid = new FootballTeam("Real Madrid");

        League<FootballTeam> footballLeague = new League<>("English League");
	    footballLeague.add(arsenal);
	    footballLeague.add(barcelona);
	    footballLeague.add(chelsea);
	    footballLeague.add(realMadrid);

	    arsenal.versus(barcelona, 0, 5);
	    arsenal.versus(chelsea, 3, 1);
	    arsenal.versus(realMadrid, 3, 10);

	    barcelona.versus(arsenal, 10, 5);
	    barcelona.versus(realMadrid, 3, 1);
	    barcelona.versus(chelsea, 3, 10);

		System.out.println("");
		System.out.println("--- Score ---");
	    footballLeague.printRank();
    }
}
