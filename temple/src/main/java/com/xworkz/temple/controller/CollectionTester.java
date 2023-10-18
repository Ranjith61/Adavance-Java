package com.xworkz.temple.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.temple.dto.TempleDTO;

public class CollectionTester {
	public static void main(String[] args) {
		TempleDTO dto =new TempleDTO("krishna", "banglore", "vishnu", 2000, "raja");
		TempleDTO dto1 =new TempleDTO("hanuman", "kolar", "ganesha", 2001, "reddy");
		TempleDTO dto2 =new TempleDTO("chowdeshwari", "sigandur", "vishnu", 2005, "vodeyar");
		TempleDTO dto3 =new TempleDTO("chamundi", "mysore", "krishna", 2015, "yaduvir");
		TempleDTO dto4 =new TempleDTO("chamundi", "mysore", "vishnu", 2000, "raja");
		
		//set : relies on equally contract
		Collection<TempleDTO> collection = new HashSet<TempleDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		System.out.println("Total Temples " + collection.size());
		
		//access the elements : for each loop, iterator(), stream, forEach method();
		for(TempleDTO ref : collection) {
			System.out.println(ref.getName());
		}
		
		//collection.remove(ref)
		System.out.println("iterator");
		//abstraction : example
		Iterator<TempleDTO> iterator = collection.iterator();
		while(iterator.hasNext()) {
			TempleDTO ele = iterator.next();
			System.out.println(ele.getName());
			
			if(ele.getName().equals("chowdeshwari")) {
				iterator.remove();
			}
		}


	}

}
