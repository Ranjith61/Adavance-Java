package com.xworkz.validatedto.service;

import com.xworkz.validatedto.DTO.WasteDTO;

public interface WasteService {
	boolean validateAndSave(WasteDTO dto);

}
