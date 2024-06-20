//Sum Of Numbers Program For Given Range

package com.apjfsa;

import java.util.Scanner;

public class DemoLoops {

	public void sumN(int n) {
		
		int i=1,sum=0;
		
		while(i<=n)
		
		{
			sum +=i;
			i++;
		}
		
		System.out.println("sum of " + n + " numbers = " + sum);
	}
	
	
	public static void main(String[] args) {
	
		DemoLoops demo = new DemoLoops();
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		
		int  num = scanner.nextInt();
		
		demo.sumN(num);
		
		
		
		
		

	}

}
