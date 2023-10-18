package com.array.xworkz;

public class Sport {

		public String sportName;
		public  Player[] players;

		

		public Sport(String name, Player[] players) {
			System.out.println("Invoking const in Sport");
			this.sportName = name;
			this.players = players;

		}
		
		public void printInfo()
		{
			System.out.println("-------------------------------------------------------");
			System.out.println("Invoking printInfo in Sport");
			System.out.println("Sport name is "+this.sportName);
			for(int i=0;i<players.length;i++)
			{
				Player player=players[i];
				player.printInfo();
				
			}
		}
		
		
		
	}

