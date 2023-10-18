package com.array.xworkz;

public class SportRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SportRunner");
		
		Player players1 = new Player("Rohit", "Two");
		Player players2 = new Player("Virat", "Three");
		Player players3 = new Player("Sachin", "fourteen");
		Player players4 = new Player("Dhoni", "Eleven");
		Player players5 = new Player("Akash", "seven");

		Player[] players = { players1, players2, players3, players4, players5 };
		
		Sport sport=new Sport("Cricket", players);
		sport.printInfo();
	}
}
