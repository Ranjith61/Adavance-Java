package com.xoworkz.dto;

import java.util.Collection;
import java.util.HashSet;

public class VegetableTester {
	public static void main(String[] args) {
		VegetableDTO dto = new VegetableDTO(12, "radish", 95, 5);
		VegetableDTO dto1 = new VegetableDTO(11, "carrot", 101, 1);
		VegetableDTO dto2 = new VegetableDTO(33, "Beetroot", 125, 2);
		VegetableDTO dto3 = new VegetableDTO(54, "Capsicum", 112, 3);
		VegetableDTO dto4 = new VegetableDTO(98, "Beans", 43, 9);
		VegetableDTO dto5 = new VegetableDTO(98, "Beans", 43, 9);

		Collection<VegetableDTO> coll = new HashSet<VegetableDTO>();
		coll.add(dto);
		coll.add(dto1);
		coll.add(dto2);
		coll.add(dto3);
		coll.add(dto4);
		coll.add(dto5);

		
		coll.forEach((v) -> {
			if (v.getPrice() <= 100) {
				System.out.println("vegetable is less than 100 : " + v.getName());
			} else {
				System.err.println("vegetable is greater than 100 : " +v.getName());
				coll.add(v);
			}

		});
		
		System.out.println(coll);

	}

}
