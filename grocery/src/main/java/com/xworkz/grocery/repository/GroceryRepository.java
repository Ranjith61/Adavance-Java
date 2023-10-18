package com.xworkz.grocery.repository;

import java.util.Collection;

import com.xworkz.grocerydto.GroceryDTO;

public interface GroceryRepository {
	
	public void save(GroceryDTO dto);
	
	default int  total() {
		return 0;
	}
	
	default Collection<GroceryDTO> getall(){
		return null;
		
	}

}
