package com.bridgelabz;
import java.util.Scanner;

public class MaxTestMain {
	static Scanner sc = new Scanner(System.in);
	/*
	 * Execution start from main and getting inputs from user
	 * using sc object
	 */
	public static void main(String[] args) {
	    System.out.println("enter number1: ");
        int intFirst = sc.nextInt();
        System.out.println("enter number2: ");
        int intSecond = sc.nextInt();
        System.out.println("enter number3: ");
        int intThird = sc.nextInt();
        
        System.out.println("enter float number1: ");
        float floatFirst = sc.nextFloat();
        System.out.println("enter float number2: ");
        float floatSecond = sc.nextFloat();
        System.out.println("enter float number3: ");
        float floatThird = sc.nextFloat();
        
        System.out.println("enter first string: ");
        String stringFirst = sc.next();
        System.out.println("enter second string: ");
        String stringSecond = sc.next();
        System.out.println("enter third string: ");
        String stringThird = sc.next();
        /*
         * call maximum method using class name and passing 3 parameters.
         */
        System.out.println("The Maximum Integer Number is: " + MaximumTest.maximum(intFirst,intSecond,intThird));	
		System.out.println("The Maximum Float Number is: " + MaximumTest.maximum(floatFirst, floatSecond, floatThird));
		System.out.println("The Maximum String is: " + MaximumTest.maximum(stringFirst, stringSecond,stringThird));
	

	}

}
