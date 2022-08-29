package com.bridgelabz;
/*
 * purpose : Find Maximum Of Three Numbers Using Generics
 * author : Amol
 * since : 2022/08/27
 */
public class MaximumOfThree {
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
	
		public static void main(String[] args) {

			System.out.println("*** Welcome To Computing Maximum Of Three Numbers Using Java Generics ***");
			Integer firstNumber = 15 ,secondNumber = 20 , thirdNumber = 10;
			findMaximum(firstNumber ,secondNumber,thirdNumber);
			Float firstNum = 10.5f ,secondNum = 20.2f , thirdNum = 25.2f;
			findMaximum(firstNum,secondNum,thirdNum);
		}


	}

