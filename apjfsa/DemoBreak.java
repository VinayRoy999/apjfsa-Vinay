package com.apjfsa;

import java.util.Scanner;

public class DemoBreak {

	
	
	public static void main(String[] args) {
		
		int withdrawAmount = 0,sumAmount = 0,ACbalance=120000;
		Scanner sc = new Scanner(System.in);
		
		while(ACbalance>0) {
		System.out.println("Enter amount to withdraw: ");
		withdrawAmount = sc.nextInt();
		
		sumAmount+= withdrawAmount;
		ACbalance-= withdrawAmount;
		
		System.out.println("A/c Balance =" + ACbalance + "\nAmount Withdrawn: " + sumAmount);

		if(sumAmount>50000)
			
			break;
		
	}

	ACbalance-= withdrawAmount;	
		
	System.out.println("A/c Balance =" + ACbalance + " Amount Withdrawn:" + sumAmount );
		
}
	
}
