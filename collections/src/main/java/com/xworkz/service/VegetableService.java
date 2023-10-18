package com.xworkz.service;

import java.util.Collection;

import com.xoworkz.dto.VegetableDTO;

public interface VegetableService {
	boolean validateAndSave(VegetableDTO dto);

	default Collection<VegetableDTO> getall() {
		return null;

	}
}
