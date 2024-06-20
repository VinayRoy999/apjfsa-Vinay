package com.apjfsa;

public class Assignop {

	public static void main(String[] args) {
		
       int a,b;
       a= 50;
       b=40;
       
       System.out.println("a="+a+", b="+b);
       a+= 20;
       
       System.out.println("a="+ a);

       System.out.println("b="+(b-=10));
		
	   System.out.println("a==b is  " + (a>b));
	
	   

		int big= a>b?a:b;
		System.out.println("Big=" + big);
	   
		
	}

}
