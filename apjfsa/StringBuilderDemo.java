package com.apjfsa;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		
		StringBuilder strb = new StringBuilder("Hello world");
		
		System.out.println(strb);
		
		System.out.println(strb.length());
		
		System.out.println(strb.indexOf("o"));
		
		String s = strb.toString();
		
		System.out.println(s);

		StringBuffer strb1 = new  StringBuffer(strb);
		
		System.out.println(strb1);
		

		
	}

}
