package com.java.arrays;

public class Arrays {

	public static void main(String[] args) {
		
//		String name = "Praveen";
//		String middleName = "Kumar";
//		String lastName = "Ashapure";
//		
//		String[] aus = new String[5];
//		String[] india = {"Mohan","Ram","Ashish","Praveen"};
//		
//		char[] nn = {'P','R','A','V','E','E','N'};
//		char[] n = new char[7];
////		n[0] = 'P';
////		n[1] = 'R';
////		n[2] = 'A';
////		n[3] = 'V';
////		n[4] = 'E';
////		n[5] = 'E';
////		n[6] = 'N';
//		
//		aus[0] = "John";
//		aus[1] = "stephen";
//		aus[2] = "paul";
//		aus[3] = "johny";
//		aus[4] = "mack";
//		
//		System.out.println("Full name is : " + name + " " + middleName + " " + lastName);
//		System.out.println("Array aus : " + nn[3]);
//		
//		// LOOP for loop
//		for(int i=0;i<=4;i++) {
//			System.out.println(aus[i]);
//		}
//		
//		// DO WHILE LOOP
//		int i=0;
//		do {
//			System.out.println(aus[i]);
//			i++;
//		} while(i<=4);
//		
//		// WHILE LOOP
//		int a=0;
//		while(a<=4) {
//			System.out.println(aus[a]);
//			a++;
//		}
		
		int num = 5;
		
		// IF CONDITIONAL STATEMENTS
		if(num == 5) {
			System.out.println("Praveen");
		}
		if(num == 2) {
			System.out.println("Anil");
		}
		
		// IF-ELSE CONDITIONAL STATEMENTS
		if(num == 10) {
			System.out.println("Rohit");
		}
		else {
			System.out.println("Amit");
		}
		
		// IF-ELSE-IF CONDITIONAL STATEMENTS
		if(num == 5) {
			System.out.println("Praveen");
		}
		else if(num == 2) {
			System.out.println("Anil");
		}
		else if(num == 10) {
			System.out.println("Rohit");
		}
		else {
			System.out.println("Amit");
		}
		
		num = 11;
		int mod = num%2;
		
		System.out.println(mod);
		
		int aa = 2;
		int limit = 10;
		for(int bb=1;bb<=limit;bb++) {
			System.out.println(aa);
			aa = aa+2;
		}
		
	}
	
	/**
	 *     num = 11;
	 *     Odd and even number
	 *     
	 *     5,7 8
	 *     Series of odd and even number .. limit 10
	 *     
	 *     1,2,3,4,5
	 *     use if
	 *     if i will say num = 3
	 *     then it should type 1,2,3
	 *     
	 *     Similarly above one 
	 *     if will say 3, then it should type 3 only
	 */
	
}
