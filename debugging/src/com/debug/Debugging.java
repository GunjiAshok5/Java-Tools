package com.debug;

public class Debugging {

	
	public static void main(String[] args) {
		
	   System.out.println("START...");
	   int a=10;
	   a=++a + a++ + --a + a++ ;
	   if(a>35)
	   {
		   System.out.println("valid");
	   }else {
		   System.out.println("Invalid");
	   }
		
	
		
	}
}
