package com.xworkz.temple.repository;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleRepository {

	public void save(TempleDTO dto);

	default int total() {
		return 0;
	}

	default Collection<TempleDTO> getall() {
		return null;

	}

}
