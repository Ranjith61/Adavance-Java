package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;

public class Email {
	public static void main(String[] args) {
		Collection<String> ref = new HashSet<String>();

		ref.add("ranjithkumar.e@gmail.com");
		System.out.println(ref);

		int memory = ref.size();
		System.out.println(memory);

		boolean num = ref.addAll(ref);
		System.out.println(num);

		boolean contain = ref.contains("ranjithkumar.e@gmail.com");
		System.out.println(contain);

		ref.iterator();
		System.out.println(ref);

		boolean containAll = ref.containsAll(ref);
		System.out.println(containAll);

		boolean empty = ref.isEmpty();
		System.out.println(empty);

		boolean retain = ref.retainAll(ref);
		System.out.println("Retain :" + retain);

		Object[] com = ref.toArray();
		System.out.println(com);

		boolean rmv = ref.remove(ref);
		System.out.println(rmv);

		boolean remove = ref.removeAll(ref);
		System.out.println(remove);

	}

}
