package com.xworkz.grocery.repository;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.grocerydto.GroceryDTO;

public class GroceryRepositoryImpl implements GroceryRepository {
	private Collection<GroceryDTO> group = new LinkedList<GroceryDTO>();

	@Override
	public void save(GroceryDTO dto) {
		System.out.println("invoking save in GroceryRepositoryImpl ");
		boolean saved = group.add(dto);
		if (saved) {
			System.out.println("Data saved successfully.." + dto);
		} else {
			System.err.println("not saved successfully.." + dto);
		}
	}
	
	@Override
	public int total() {
		
		return this.group.size();
	}
	
	@Override
	public Collection<GroceryDTO> getall() {
		
		return this.group;
	}

}
