package com.bridgelabz;

import java.util.Scanner;

/*
 * purpose : Find Maximum Of Three Numbers Using Generics
 * author : Amol
 * since : 2022/08/27
 */
public class MaximumOfThree {
    static Integer firstNumber = 15 ,secondNumber = 20 , thirdNumber = 10;
    static Float firstNum = 10.5f ,secondNum = 20.2f , thirdNum = 25.2f;
	static Character firstChar = 'f' ,secondChar = 'd' , thirdChar = 'a';
	static int num;
	/*
	 * UC1 : find the maximum of three integers using compareTo method.
	 */
	public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println("The maximum Int number is: " + maximumNumber);
	}
	
	/*
	 * UC2 : find the maximum of three Float Numbers using compareTo method.
	 */
	public static void findMaximum(Float firstNum, Float secondNum, Float thirdNum) {
		Float maximumNumber;
		
		if(firstNum.compareTo(secondNum)>0 && firstNum.compareTo(thirdNum)>0) {
			maximumNumber = firstNum;
		}
		else if(secondNum.compareTo(firstNum)>0 && secondNum.compareTo(thirdNum)>0) {
			maximumNumber = secondNum;
		}
		else {
			maximumNumber = thirdNum;
		}
		
		System.out.println("The maximum Float number is: " + maximumNumber);
	}
	/*
	 * UC3 : Find the maximum Of three characters.
	 */
	public static void findMaximum(Character firstChar, Character secondChar, Character thirdChar) {
		Character maximumChar;
		
		if(firstChar.compareTo(secondChar)>0 && firstChar.compareTo(thirdChar)>0) {
			maximumChar = firstChar;
		}
		else if(secondChar.compareTo(firstChar)>0 && secondChar.compareTo(thirdChar)>0) {
			maximumChar = secondChar;
		}
		else {
			maximumChar = thirdChar;
		}
		
		System.out.println("The maximum Three Character is: " + maximumChar);
	}
	
		public static void main(String[] args) {

			System.out.println("*** Welcome To Computing Maximum Of Three Numbers Using Java Generics ***");
			
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println("Enter a choice : \n 1.Max OF Three Integers \n 2.Max Of Three Floats \n 3.Max OF Three Characters \n 4.Exit ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				findMaximum(firstNumber ,secondNumber,thirdNumber);
				break;
			case 2:
				findMaximum(firstNum,secondNum,thirdNum);
				break;
			case 3:
				findMaximum(firstChar,secondChar,thirdChar);
				break;
			default :
				System.exit(0);
			}
		}while(num != 4);
		sc.close();
		}
	}

