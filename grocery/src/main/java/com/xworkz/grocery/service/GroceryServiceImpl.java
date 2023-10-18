package com.xworkz.grocery.service;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocerydto.GroceryDTO;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;

	}

	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("invoking validate and save in grocery" + dto);
		groceryRepository.save(dto);
		return true;
	}
	
	@Override
	public int total() {
			
		return this.groceryRepository.total();
	}
	
	@Override
	public Collection<GroceryDTO> getall() {
		
		return this.groceryRepository.getall();
	}

}
