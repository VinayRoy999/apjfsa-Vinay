package com.newapjfsa;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add('a');
		list.add(3.14);
		list.add("java");
		System.out.println(list);
		list.add(true);
		list.add(1,2);
		
		list.add(1,2);
		System.out.println(list);
		
//		list.set(2, 4);
//		System.out.println(list);
		
		list.set(2, 20);
		System.out.println(list);

		list.add(20);
		list.add(30);
		
		System.out.println(list);

		
		
		System.out.println(list.indexOf(20));
				
		System.out.println(list.contains(1));
		
		System.out.println(list.get(0));
		
		System.out.println(list.lastIndexOf(20));

		System.out.println(list.size());
		
		System.out.println(list.remove(9));
		System.out.println(list);

		
		System.out.println(list.remove(3.14));
		System.out.println(list);


		System.out.println(list.remove(4));
		System.out.println(list);

		
		System.out.println(list.isEmpty());
		
		List l = new ArrayList();
		
		System.out.println(l.isEmpty());
		
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.addAll(list);





		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		List<Integer> arrlist = new ArrayList<Integer>();		
//		arrlist.addAll(list);
//		
//		System.out.println(arrlist);

		
//		List arrlist = new ArrayList();
//
//		arrlist.addAll(list);
//		
//		for(int a:arrlist)
//			
		

		
		
		
	}

}
