package com.xworkz.DTO;

import java.sql.Ref;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DTORunner {
	public static void main(String[] args) {
		// ww1
		// President Dto
		PresidentDTO dto11 = new PresidentDTO(21, "Modi", LocalDate.of(2019, 2, 2), LocalDate.of(21, 2, 4));
		PresidentDTO dto12 = new PresidentDTO(22, "Trump", LocalDate.of(2018, 5, 5), LocalDate.of(21, 3, 4));

//		Collection<PresidentDTO> presi = new HashSet<PresidentDTO>();
//		presi.add(dto11);
//		presi.add(dto12);	

		// Country DTO
		CountryDTO dto9 = new CountryDTO(1, "Japan", dto11, "Antartica");
		CountryDTO dto10 = new CountryDTO(1, "Italy", dto12, "Africa");

		// coll of countries involved in ww1
		Collection<CountryDTO> count = new HashSet<CountryDTO>();
		count.add(dto9);
		count.add(dto10);

		// WarDTO
		WarDTO dto1 = new WarDTO(22, LocalDate.of(2022, 4, 2), LocalDate.of(2023,3,1),count, "India");

		// ww2
		// presidentDto
		PresidentDTO dto19 = new PresidentDTO(21, "Modi", LocalDate.of(1922, 10, 31), LocalDate.of(1943, 7, 25));
		PresidentDTO dto20 = new PresidentDTO(22, "Trump", LocalDate.of(1926, 12, 25), LocalDate.of(1950, 5, 22));

		// countryDto
		CountryDTO countrydto = new CountryDTO(1, "Japan", dto11, "Antartica");
		CountryDTO countrydto1 = new CountryDTO(1, "Italy", dto12, "Africa");

		// collection of countrieds involved in ww2
		Collection<CountryDTO> country = new HashSet<CountryDTO>();
		country.add(countrydto1);
		country.add(countrydto1);

		// wardto
		WarDTO dto2 = new WarDTO(34, LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2), count, "Afganisthan");

		// war dto collection
		Collection<WarDTO> wars = new HashSet<WarDTO>();
		wars.add(dto1);
		wars.add(dto2);

		presidentByCountry(wars, "Germany");

		presidents(wars);

		countries(wars);

		detailsByWarDate(wars, LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2));

		detailsByContinent(wars, "Asia");

	}

	private static void detailsByContinent(Collection<WarDTO> wars, String continentName) {

		List<String> presidents = wars.stream().flatMap(war -> war.getCountry().stream())
				.filter(country -> country.getName().equals(country))
				.map(president -> president.getPresident().getName()).collect(Collectors.toList());

		presidents.forEach(ref -> System.out.println("The president of is " + ref));
		System.out.println();
	}

	private static void detailsByWarDate(Collection<WarDTO> wars, LocalDate startDate, LocalDate endDate) {
		Set<WarDTO> fullData = wars.stream()
				.filter(war -> war.getStartDate().equals(startDate) && war.getEndDate().equals(endDate))
				.collect(Collectors.toSet());
		System.out.println("War detail between " + startDate + " and " + endDate + " are ");
		fullData.forEach(ref -> System.out.println(ref));
	}

	private static void countries(Collection<WarDTO> wars) {
		List<String> countries = wars.stream().flatMap(m -> m.getCountry().stream().map(mu -> mu.getName()))
				.collect(Collectors.toList());
		System.out.println("Countries saved are ");
		countries.forEach(ref -> System.out.println(ref));

	}

	private static void presidents(Collection<WarDTO> wars) {

		List<String> presidents = wars.stream()
				.flatMap(war -> war.getCountry().stream().map(country -> country.getPresident().getName()))
				.collect(Collectors.toList());
		System.out.println("All presidents saved are ");
		presidents.forEach(ref -> System.out.println(ref));
	}

	private static void presidentByCountry(Collection<WarDTO> wars, String countryName) {
		List<String> presidents = wars.stream().flatMap(war -> war.getCountry().stream())
				.filter(country -> country.getName().equals(countryName))
				.map(president -> president.getPresident().getName()).collect(Collectors.toList());

	}

}
