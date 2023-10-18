package com.xworkz.comparable;

import java.util.Collection;
import java.util.HashSet;

public class BrandDTORunner {
	public static void main(String[] args) {
		BrandDTO dto = new BrandDTO("Google", "Sundar Pichai", 200, "USA");
		BrandDTO dto1 = new BrandDTO("Fossil", "Tom Kartsotis ", 221, "USA");
		BrandDTO dto2 = new BrandDTO("Tesla", "Elon Musk", 8.14, "USA");
		BrandDTO dto3 = new BrandDTO("Redmi", "Rajendra Saraf", 13.2, "China");
		BrandDTO dto4 = new BrandDTO("Sonata", "Samir Dhir", 5.53, "India");
		BrandDTO dto5 = new BrandDTO("Infosys`", "Sundar Pichai", 200, "USA");
		BrandDTO dto6 = new BrandDTO("Lenovo", "Yang Yuanqing", 61.3, "China");
		BrandDTO dto7 = new BrandDTO("Puma", "Arne Freundt", 8.65, "Germany");
		BrandDTO dto8 = new BrandDTO("Dell", "Michael S Dell", 10.1, "USA");
		BrandDTO dto9 = new BrandDTO("TCS", "Ratan Tata", 27.1, "India");

		Collection<BrandDTO> collection = new HashSet<BrandDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto9);

		System.out.println("------------------");

		collection.stream().sorted().forEach(v -> System.out.println(v));

//		System.out.println("RevenueInBillion is more than 20");
//		Collection<BrandDTO> coll = new HashSet<BrandDTO>();
//		collection.forEach(v -> {
//			if (v.getRevenueInBillion() > 20) {
//				coll.add(v);
//			} else {
//				System.out.println(v.getName() + " is less than 20");
//			}
//
//		});
//
//		coll.forEach(v -> System.out.println(v));
//
//		System.out.println("RevenueInBillion is less than 20");
//		Collection<BrandDTO> less = new HashSet<BrandDTO>();
//		collection.forEach(z -> {
//			if (z.getRevenueInBillion() < 20) {
//				less.add(z);
//			} else {
//				System.out.println(z.getName() + " is greater than 20");
//			}
//
//		});
//
//		less.forEach(x -> System.out.println(x));
		System.out.println("printing brand having greater than 20");
		collection.stream().filter((v) -> v.getRevenueInBillion() > 20)
				.forEach((v) -> System.out.println(v.toString()));

		System.out.println("printing brand having lesser than 20");
		collection.stream().filter((x) -> x.getRevenueInBillion() < 20)
				.forEach((x) -> System.out.println(x.toString()));

		System.out.println("printing origin from USA");
		collection.stream().filter((v) -> v.getCountry() == "USA").forEach((v) -> System.out.println(v.toString()));

		System.out.println("printing brands not from USA");
		collection.stream().filter((u) -> u.getCountry() != "USA").forEach((u) -> System.out.println(u.toString()));

		System.out.println("prnting brands name starts with s");
		collection.stream().filter((r) -> r.getName().startsWith("S")).forEach((r) -> System.out.println(r.toString()));

		System.out.println("printing brand name length more than 5");
		collection.stream().filter((l) -> l.getName().length() > 5).forEach((l) -> System.out.println(l.toString()));

		System.out.println("printing brand name length less than 5");
		collection.stream().filter((m) -> m.getName().length() < 5).forEach((m) -> System.out.println(m.toString()));

		System.out.println("printing brand name length equal to 5");
		collection.stream().filter((p) -> p.getName().length() == 5).forEach((p) -> System.out.println(p.toString()));
		

	}

}
