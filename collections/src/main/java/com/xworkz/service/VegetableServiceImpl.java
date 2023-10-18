package com.xworkz.service;

import java.util.Collection;

import com.xoworkz.dto.VegetableDTO;
import com.xworkz.repository.VegetableRepository;

public class VegetableServiceImpl implements VegetableService {
	private VegetableRepository vegetableRepository;

	public VegetableServiceImpl(VegetableRepository vegetableRepository) {
		this.vegetableRepository = vegetableRepository;
	}

	@Override
	public boolean validateAndSave(VegetableDTO dto) {
		System.out.println("Invoking validate and save in vegetabledto");
		return false;
	}

	@Override
	public Collection<VegetableDTO> getall() {

		return this.vegetableRepository.getall();
	}

}
