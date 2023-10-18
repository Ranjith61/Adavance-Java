package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;

public class Mobile {

	public static void main(String[] args) {
		Collection<Long> num = new HashSet<Long>();

		boolean add = num.add(56789L);
		System.out.println(add);

		boolean numb = num.contains(num);
		System.out.println(numb);

		int find = num.size();
		System.out.println(find);

		num.iterator();
		System.out.println(num);

		boolean emp = num.isEmpty();
		System.out.println(emp);

		boolean all = num.addAll(num);
		System.out.println(all);

		Object[] com = num.toArray();
		System.out.println(com);

		boolean rmv = num.remove(num);
		System.out.println(rmv);

		boolean reta = num.retainAll(num);
		System.out.println(reta);
		
		boolean rmsc = num.removeAll(num);
		System.out.println(rmsc);

	}

}
