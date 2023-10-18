package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MobileNo {
	public static void main(String[] args) {
		Map<String, Long> dictionaries = new HashMap<String, Long>();
		dictionaries.put("Ranjith kumar", 8088064463L);
		dictionaries.put("Rakshith", 7236549870L);
		dictionaries.put("Prabhas", 9827645424L);
		dictionaries.put("Pramod", 9876543530L);
		dictionaries.put("Varun", 8088065562L);

		System.out.println("priniting the name and mobileNo");
		dictionaries.forEach((Name, MobileNo) -> {
			System.out.println("Name: " + Name + ", MobileNo: " + MobileNo);
		});

		System.out.println("printing all mobile numbers");
		Collection<Long> value = dictionaries.values();
		value.forEach(System.out::println);

		System.out.println("Priniting all name in upper case");
		Set<String> names = dictionaries.keySet();
//		names.forEach(System.out::println); method Reference
		names.forEach(u -> System.out.println(u.toUpperCase()));
//		dictionaries.keySet().forEach(y -> System.out.println(y));

		System.out.println("printing all names with more than 10 characters***");
		dictionaries.keySet()
		.stream().
		filter(name -> name.length() > 10)
		.forEach(System.out::println);
		

		System.out.println("***printing all names with less than 10 characters***");
		dictionaries.keySet().stream().filter(name -> name.length() < 10).forEach(System.out::println);

		System.out.println("Printing all mobile numbers ending with 0");
		value.stream().filter(mobileNo -> mobileNo % 10 == 0).forEach(System.out::println);

		System.out.println("Printing all mobile numbers starting with 8");
		dictionaries.values().stream().filter(mobileNo -> mobileNo.toString().startsWith("8"))
				.forEach(System.out::println);
	}

}
