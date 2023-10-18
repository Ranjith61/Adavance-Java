package com.xworkz.validatedto.boot;

import com.xworkz.validatedto.DTO.WasteDTO;
import com.xworkz.validatedto.repository.WasteRepository;
import com.xworkz.validatedto.repository.WasteRepositoryImpl;
import com.xworkz.validatedto.service.WasteService;
import com.xworkz.validatedto.service.WasteServiceImpl;

public class WasteRunner {
	public static void main(String[] args) {
		
		System.out.println("Invoking main in WasteRunner...");
		WasteRepository wasteRepository = new WasteRepositoryImpl();
		WasteService wasteService = new WasteServiceImpl(wasteRepository);
		WasteDTO dto = new WasteDTO("Municipal waste", "plastic", 200.33);
		
		boolean persisted = wasteService.validateAndSave(dto);
		System.out.println("persisted:" + persisted);
		
	}

}
