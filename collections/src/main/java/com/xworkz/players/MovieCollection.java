package com.xworkz.players;

import java.util.Collection;
import java.util.HashSet;

public class MovieCollection {
	public static void main(String[] args) {
		MovieDTO dto = new MovieDTO(1, "RRR", language.HINDI, "Rajamouli", "Rajamouli", 0.5);
		MovieDTO dto1 = new MovieDTO(2, "Jawan", language.HINDI, "Shahrukh khan", "Atlee", 2);
		MovieDTO dto2 = new MovieDTO(3, "Top Gun", language.ENGLISH, "Tom Cruise", "Rajamouli", 3);
		MovieDTO dto3 = new MovieDTO(4, "Joker", language.ENGLISH, "Todd Phillips", "Todd Phillips", 0.3);
		MovieDTO dto4 = new MovieDTO(5, "Avengers: Endgame", language.ENGLISH, " Anthony and Joe Russo", "Kevin Feige", 0.3);
		MovieDTO dto5 = new MovieDTO(6, "3 Idiots", language.HINDI, "Rajkumar Hirani", "Rajkumar Hirani", 5);
		MovieDTO dto6 = new MovieDTO(7, "Bahubali: The Beginning", language.KANNADA, "Rajamouli", "Rajamouli", 1.5);
		MovieDTO dto7 = new MovieDTO(8, "Uri: The Surgical Strike", language.HINDI, "Aditya Dhar", "Aditya Dhar", 0.8);
		MovieDTO dto8 = new MovieDTO(9, "KGF: Chapter 1", language.KANNADA, "Prashanth Neel", "Vijay Kiragandur", 25);
		MovieDTO dto9 = new MovieDTO(10, "Kirik Party", language.KANNADA, "Rishab Shetty", "G.S. Guptha", 0.4);
		MovieDTO dto10 = new MovieDTO(11, "Bahubali 2: The end", language.KANNADA, "Rajamouli", "Rajamouli", 2);

		
		Collection<MovieDTO> collection = new HashSet<MovieDTO>();
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
		for (MovieDTO movieDTO : collection) {
			System.out.println(movieDTO);
		}

		Collection<MovieDTO> lang = new HashSet<MovieDTO>();
		collection.forEach((v)->{
			if(v.getLang().equals(language.KANNADA)){
				lang.add(v);
			}
			else {
				System.out.println(v.getName()+" is not in kannada");
			}
		});
		for (MovieDTO movieDTO : lang) {
			System.out.println(movieDTO);
		}
		
		Collection<MovieDTO> direct = new HashSet<MovieDTO>();
		collection.forEach((v)->{
			if(v.getDirector().equals("Rajamouli")) {
				direct.add(v);
			}
			else {
				System.out.println(v.getName()+" is not directed by rajamouli");
			}
		});
		for (MovieDTO movieDTO : direct) {
			System.out.println(movieDTO);
		}
		
		Collection<MovieDTO> prod = new HashSet<MovieDTO>();
		collection.forEach((v)->{
			if(v.getProducer().equals("Rajamouli")) {
				prod.add(v);
			}
			else {
				System.out.println(v.getName()+" is not produced by rajamouli");
			}
		});
		for (MovieDTO movieDTO : prod) {
			System.out.println(movieDTO);
		}
		
		Collection<MovieDTO> budget = new HashSet<MovieDTO>();
		collection.forEach((v)->{
			if(v.getBudget()>1) {
				budget.add(v);
			}
			else {
				System.out.println(v.getName()+" is less than 1 crore");
			}
		});
		for (MovieDTO movieDTO : budget) {
			System.out.println(movieDTO);
		}
		
		Collection<MovieDTO> budget1 = new HashSet<MovieDTO>();
		collection.forEach((v)->{
			if(v.getBudget()<1) {
				budget1.remove(v);
			}
			else {
				System.out.println(v.getName()+" is greater than 1 crore");
			}
		});
		for (MovieDTO movieDTO : budget1) {
			System.out.println(movieDTO);
		}
	}
	}

