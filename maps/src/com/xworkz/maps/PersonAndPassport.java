package com.xworkz.maps;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonAndPassport {

	public static void main(String[] args) {
		PersonDTO personDTO = new PersonDTO(1, "Ranjan", "Ranjan@gmail.com", 9876543456L);
		PersonDTO personDTO1 = new PersonDTO(2, "Shankar", "omkar@gmail.com", 7809876544L);
		PersonDTO personDTO2 = new PersonDTO(3, "Ronak", "harihran@gmail.com", 9876523457L);
		PersonDTO personDTO3 = new PersonDTO(4, "Vinod", "vinod@gmail.com", 8764567878L);
		PersonDTO personDTO4 = new PersonDTO(5, "Harsha", "harsha@gmail.com", 8987654378L);
		PersonDTO personDTO5 = new PersonDTO(6, "Mohammad Ismail", "mismail@gmail.com", 8765434567L);
		PersonDTO personDTO6 = new PersonDTO(7, "Reddy", "reddy@gmail.com", 8765456789L);
		PersonDTO personDTO7 = new PersonDTO(8, "Abdul", "abdul@gmail.com", 7654345678L);
		PersonDTO personDTO8 = new PersonDTO(9, "Yash", "yashu@gmail.com", 9876534568L);

		PassportDTO passPortDTO = new PassportDTO(1, 98764569L, LocalDate.of(2016, 3, 21), "India",
				LocalDate.of(2026, 3, 1), Type.DOMESTIC);
		PassportDTO passPortDTO1 = new PassportDTO(2, 98764568L, LocalDate.of(2002, 4, 1), "Australia",
				LocalDate.of(2021, 4, 1), Type.INTERNATIONAL);
		PassportDTO passPortDTO2 = new PassportDTO(3, 87655679L, LocalDate.of(2016, 1, 11), "India",
				LocalDate.of(2025, 1, 11), Type.DOMESTIC);
		PassportDTO passPortDTO3 = new PassportDTO(4, 76456789L, LocalDate.of(2014, 1, 14), "Pakistan",
				LocalDate.of(2004, 3, 14), Type.INTERNATIONAL);
		PassportDTO passPortDTO4 = new PassportDTO(5, 87656798L, LocalDate.of(2012, 6, 15), "USA",
				LocalDate.of(2042, 8, 1), Type.INTERNATIONAL);
		PassportDTO passPortDTO5 = new PassportDTO(6, 87645679L, LocalDate.of(2017, 7, 16), "China",
				LocalDate.of(2029, 3, 6), Type.INTERNATIONAL);
		PassportDTO passPortDTO6 = new PassportDTO(7, 98374623l, LocalDate.of(2004, 4, 17), "China",
				LocalDate.of(2010, 3, 17), Type.DOMESTIC);
		PassportDTO passPortDTO7 = new PassportDTO(8, 87655678L, LocalDate.of(2014, 3, 20), "Netherland",
				LocalDate.of(2024, 3, 20), Type.INTERNATIONAL);
		PassportDTO passPortDTO8 = new PassportDTO(9, 98764567L, LocalDate.of(2018, 3, 26), "India",
				LocalDate.of(2023, 12, 20), Type.DOMESTIC);

		Map<PersonDTO, PassportDTO> pass = new HashMap<PersonDTO, PassportDTO>();
		pass.put(personDTO, passPortDTO);
		pass.put(personDTO1, passPortDTO1);
		pass.put(personDTO2, passPortDTO2);
		pass.put(personDTO3, passPortDTO3);
		pass.put(personDTO4, passPortDTO4);
		pass.put(personDTO5, passPortDTO5);
		pass.put(personDTO6, passPortDTO6);
		pass.put(personDTO7, passPortDTO7);
		pass.put(personDTO8, passPortDTO8);

		System.out.println("Collecting all PersonDTO");
		pass.keySet().stream().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Collecting all PasportDTO");
		pass.values().stream().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Collect all passport by type");
		pass.values().stream().filter(t -> t.getPassport().equals(Type.DOMESTIC)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("Collect all passportDTO by issuedDate less than todays date");
		pass.values().stream().filter(i -> i.getIssuedDate().isBefore(LocalDate.now())).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("Collect all expired passports");
		pass.values().stream().filter(e -> e.getExpiryDate().isBefore(LocalDate.now())).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("Get person by name");
		pass.keySet().stream().filter(n -> n.getName().equals("Reddy")).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("Get Passport by number");
		pass.values().stream().filter(n -> n.getNo() == 98764568).collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
