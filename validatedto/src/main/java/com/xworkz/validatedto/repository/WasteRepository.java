package com.xworkz.validatedto.repository;

import com.xworkz.validatedto.DTO.WasteDTO;

public interface WasteRepository {
	int TOTAL_ITEMS = 5;
	
	public void save(WasteDTO dto);
}
