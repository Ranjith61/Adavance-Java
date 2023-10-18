package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.temple.dto.TempleDTO;

public class TempleRepositoryImpl implements TempleRepository {
	private Collection<TempleDTO> group = new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
		System.out.println("invoking save in TempleRepositoryImpl");
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
	public Collection<TempleDTO> getall() {

		return this.group;
	}

}
