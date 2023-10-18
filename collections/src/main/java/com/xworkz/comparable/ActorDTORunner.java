package com.xworkz.comparable;

import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ActorDTORunner {
	public static void main(String[] args) {
		ActorDTO dto = new ActorDTO(2.2, "NTR", "Telegu", "Male", "India");
		ActorDTO dto1 = new ActorDTO(5.1, "Pooja Hegde", "Hindi", "Fe Male", "India");
		ActorDTO dto2 = new ActorDTO(6.2, "Vijay", "Tamil", "Male", "Russia");
		ActorDTO dto3 = new ActorDTO(9.6, "Bala krishna", "Marati", "Male", "Japan");
		ActorDTO dto4 = new ActorDTO(1.7, "Samantha", "Gujurati", "Fe Male", "London");
		ActorDTO dto5 = new ActorDTO(3.5, "Hritik Roshan", "Malyalam", "Male", "India");
		ActorDTO dto6 = new ActorDTO(55.3, "Naga chaitanya", "English", "Male", "USA");
		ActorDTO dto7 = new ActorDTO(87.1, "Akhil", "Telegu", "Male", "Brazil");
		ActorDTO dto8 = new ActorDTO(22.4, "Chiranjivi", "Telegu", "Male", "Australia");
		ActorDTO dto9 = new ActorDTO(81.6, "Rajkumar", "Kannada", "Male", "India");

		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);

		collection.stream().sorted().forEach(v -> System.out.println(v));

		System.out.println("Collecting all actors is desc order by name and then print only by name");

		List<String> name = collection.stream()
				.sorted((n1, n2) -> n2.getName().compareTo(n1.getName()))
				.map(nq -> nq.getName())
				.collect(Collectors.toList());// desc : list asc:set
		name.forEach(n -> System.out.println(n));
//
//		System.out.println("Country in uppercase des order and print");
//		List<String> country = collection.stream()
//				.sorted((y1, y2) -> y2.getCountry().compareTo(y1.getCountry()))
//				.map(a -> a.getCountry())
//				.collect(Collectors.toList());
//		country.forEach(a -> System.out.println(a));

		System.out.println("Countries in Uppercase in descending order");
		collection.stream().sorted((a1,a2)->a2.getCountry().compareTo(a1.getCountry()))
		.map(ref->ref.getCountry().toUpperCase())
		.collect(Collectors.toList())
		.forEach((c)->System.out.println(c));
		
		
		System.out.println("Printing ID in ascending order");
		collection.stream().map(ref->ref.getId()).sorted().collect(Collectors.toList())
		.forEach((c)->System.out.println(c));
		
		
		System.out.println("All actors in ascending order by language known");
		collection.stream().sorted((e1,e2)->e1.getLangKnown().compareTo(e2.getLangKnown()))
		.forEach((c)->System.out.println(c));
		
		
		System.out.println("All actors in descending order by language known");
		collection.stream().sorted((e1,e2)->e2.getLangKnown().compareTo(e1.getLangKnown()))
		.forEach((c)->System.out.println(c));
		
		
		System.out.println("Printing  male actors ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getGender() == "Male").forEach((e) -> System.out.println(e.toString()));
		
		
		System.out.println("Printing  Female actors in descending order by name");
		collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		.filter((e) -> e.getGender() == "Female").forEach((e) -> System.out.println(e.toString()));
		
		
		System.out.println("Filter all the country print the count");
		Long count =collection.stream()
		.filter(c->c.getCountry().equals("Australia")).count();
		System.out.println("Count : " + count);
//		sorted((w1,w2)->w2.getCountry().compareTo(w1.getCountry()))
//		.map(s->s.getCountry()).forEach((q)->System.out.println(q)));
		
		
		
		System.out.println("Printing actors having ID more than 5 ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getId() > 5).collect(Collectors.toList()).forEach((e) -> System.out.println(e.toString()));
	}

}
