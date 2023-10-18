package com.xworkz.repository;

import java.util.Collection;
import java.util.HashSet;

import com.xoworkz.dto.VegetableDTO;

public class VegetableRepositoryImpl implements VegetableRepository {
	private Collection<VegetableDTO> group = new HashSet<VegetableDTO>();

	@Override
	public void save(VegetableDTO dto) {
		System.out.println("Invoking save in VegetableDTO");
		boolean saved = group.add(dto);
		if (saved) {
			System.out.println("Data saved successfully");
		} else {
			System.err.println("not saved successfully...");
		}

	}

	@Override
	public Collection<VegetableDTO> getall() {

		return this.group;

	}
}
