package com.basic;

public class IfSample {
	
		public static void main(String args[]) { 
			int x, y;
		
		x = 90; y = 20;
		if(x < y) 
			System.out.println("x is less than y");
		x = x * 2;
		if(x == y) 
			System.out.println("x now equal to y");
		if(x > y) 
			System.out.println("x is greater than y");
		x = x * 2;
		if(x == y) 
			System.out.println("x wont display anything");
}
}