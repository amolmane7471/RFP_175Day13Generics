package com.bridgelabz;
/*
 * purpose : UC4 : to create Generic Class to take in 4 variables of Generic Type.
 * @author : Amol
 * since : 2022/08/30
 */
public class MaximumTest<T extends Comparable<T>> {
	
		/*
		 * create MaximumTest parameterised constructor with 4 parameters
		 */
		
		public static <E extends Comparable<E>> E maximum(E firstVariable,E secondVariable,E thirdVariable,E fourthVariable) {
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


	
}
