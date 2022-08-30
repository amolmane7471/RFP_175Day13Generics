package com.bridgelabz;
/*
 * purpose : Refactor 2 to create Generic Class to take in 3 variables of Generic Type.
 * @author : Amol
 * since : 2022/08/30
 */
public class MaximumTest<T extends Comparable<T>> {
	
		/*
		 * create MaximumTest parameterised constructor with 3 parameters
		 */
		
		public static <E extends Comparable<E>> E maximum(E firstVariable,E secondVariable,E thirdVariable) {
			E max = firstVariable;
			if(secondVariable.compareTo(max) > 0)
			{
				max = secondVariable;
			}
			if(thirdVariable.compareTo(max) > 0)
			{
				max = thirdVariable;
			}
			return max;
		}


	
}
