package com.xworkz.validatedto.service;

import com.xworkz.validatedto.DTO.WasteDTO;
import com.xworkz.validatedto.repository.WasteRepository;

public class WasteServiceImpl implements WasteService {
	private WasteRepository wasteRepository;

	public WasteServiceImpl(WasteRepository wasteRepository) {
		this.wasteRepository = wasteRepository;
	}

	@Override
	public boolean validateAndSave(WasteDTO dto) {
		System.out.println("Invoking validateAndSave in NewsPaperServiceImpl");
		if (dto != null)// name,type,weight
		{
			String name = dto.getName();
			String type = dto.getType();
			double weight = dto.getWeight();

			if (name != null && !name.isEmpty() && name.length() > 4 && name.length() > 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid.");
			}

			if (type != null && !type.isEmpty() && type.length() > 3 && type.length() < 21) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid.");
			}

			if (weight != 0) {
				System.out.println("it is valid..");
			} else {
				System.err.println("it is not valid..");
				return false;
			}
			System.out.println("dto is valid, then store data in " + this.getClass().getSimpleName());
			wasteRepository.save(dto);
			return true;
		}else {
			System.err.println("Cannot store data, dto is invalid");

		}

		return false;
	}

}
