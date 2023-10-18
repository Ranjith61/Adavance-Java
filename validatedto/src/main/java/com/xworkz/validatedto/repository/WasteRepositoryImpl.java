package com.xworkz.validatedto.repository;

import com.xworkz.validatedto.DTO.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository  {
	WasteDTO[] dto = new WasteDTO[TOTAL_ITEMS];
	int position;
	
	@Override
	public void save(WasteDTO dto) {

		if(this.position < TOTAL_ITEMS) {
			this.dto[position] = dto;
			System.out.println(dto + "is saved at position" + this.position);
			this.position++;
		}else {
			System.err.println("storage is full cannot store the data" + dto);
		}
	}

}
