package com.bridgelabz;
/*
 * purpose : UC5 : Extend the max method to also print the max to std out using Generic Method
 * @author : Amol
 * since : 2022/08/30
 */
public class MaximumTest<T extends Comparable<T>> {
	
		/*
		 * create toPrintMax method  with 4 parameters
		 */
		
		public static <E extends Comparable<E>> E toPrintMax(E firstVariable,E secondVariable,E thirdVariable,E fourthVariable) {
			E max = firstVariable;
			if(secondVariable.compareTo(max) > 0)
			{
				max = secondVariable;
			}
			if(thirdVariable.compareTo(max) > 0)
			{
				max = thirdVariable;
			}
			if(fourthVariable.compareTo(max) > 0)
			{
				max = fourthVariable;
			}
			return max;
		}

		 public static <E> void printMax(E firstVariable,E secondVariable,E thirdVariable,E fourthVariable, E max){
		        System.out.println(max);
		    }
	
}
