package com.xworkz.players;

import java.util.Collection;
import java.util.HashSet;

public class PlayerRunner {
	public static void main(String[] args) {
		PlayerDTO dto= new PlayerDTO(18, "virat kohli", "india", Sport.CIRCKET, 32);
		PlayerDTO dto1= new PlayerDTO(7, "Dhoni", "india", Sport.CIRCKET, 40);
		PlayerDTO dto2= new PlayerDTO(2, "Suni chetri", "india", Sport.FOOTBALL, 55);
		PlayerDTO dto3= new PlayerDTO(4, "Ronaldo", "Portugal", Sport.FOOTBALL, 78);
		PlayerDTO dto4= new PlayerDTO(3, "Andrey Rublev", "Russia", Sport.TENNIS, 27);
		PlayerDTO dto5= new PlayerDTO(18, "P V sindhu", "india", Sport.TENNIS, 30);
		PlayerDTO dto6= new PlayerDTO(17, "Johny baristow", "England", Sport.CIRCKET, 31);
		PlayerDTO dto7= new PlayerDTO(22, "David Warner", "Australia", Sport.CIRCKET, 35);
		PlayerDTO dto8= new PlayerDTO(44, "Gayle", "West indies", Sport.CIRCKET, 111);
		PlayerDTO dto9= new PlayerDTO(2, "Suni chetri", "india", Sport.FOOTBALL, 55);
		PlayerDTO dto10= new PlayerDTO(2, "Messi", "Argentina", Sport.FOOTBALL, 23);
		PlayerDTO dto11= new PlayerDTO(2, "Neymar", "Brazil", Sport.FOOTBALL, 36);



		Collection<PlayerDTO> collection = new HashSet<PlayerDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto11);
		
		
		for (PlayerDTO playerDTO : collection) {
			System.out.println(playerDTO);
		}
		
	Collection<PlayerDTO> country = new HashSet<PlayerDTO>();
	collection.forEach((v)->{
		if(v.getCountry().equals("india")) {
			country.add(v);
		}else {
			System.out.println(v.getName()+ " is not from india");
		}
	});
	
	for (PlayerDTO playerDTO : country) {
		System.out.println(playerDTO);
	}
	Collection<PlayerDTO> sport = new HashSet<PlayerDTO>();
	collection.forEach((v)->{
		if(v.getSport().equals(Sport.CIRCKET)) {
			sport.add(v);
		}else {
			System.out.println(v.getName()+ "not from the circket");
		}
		
	});
	
	for(PlayerDTO playerDTO: sport) {
		System.out.println(playerDTO);
	}
	Collection<PlayerDTO> age = new HashSet<PlayerDTO>();
	collection.forEach((v)->{
		if(v.getAge()>20 && v.getAge()<30) {
			age.add(v);
		}
		else {
			System.out.println(v.getName()+" is above 30");
		}
	});
	
	
	for (PlayerDTO playerDTO : age) {
		System.out.println(playerDTO);
	}
	Collection<PlayerDTO> age1 = new HashSet<PlayerDTO>();
	collection.forEach((v)->{
		if(v.getAge()>30) {
			age1.add(v);
		}
		else {
			System.out.println(v.getName()+" is below 30");
		}
	});
	
	
	for (PlayerDTO playerDTO : age1) {
		System.out.println(playerDTO);
	}
	Collection<PlayerDTO> age2 = new HashSet<PlayerDTO>();
	collection.forEach((v)->{
		if(v.getAge()>40) {
			age2.remove(v);
		}
		else {
			System.out.println(v.getName()+" is not above 40");
		}
	});
	for (PlayerDTO playerDTO : age2) {
		System.out.println(playerDTO);
	}


}
}
