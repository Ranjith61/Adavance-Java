package com.xworkz.repository;

import java.util.Collection;

import com.xoworkz.dto.VegetableDTO;

public interface VegetableRepository {
	
	public void save(VegetableDTO dto);
	
	
	default Collection<VegetableDTO> getall(){
		return null;
		
	}

}
