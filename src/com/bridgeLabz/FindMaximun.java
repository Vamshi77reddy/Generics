package com.bridgeLabz;

public class FindMaximun {
	public static void main(String[] args)
	{
		Integer number1 = 30;
		Integer number2 = 10;
		Integer number3 = 80;
		
		Double doubleNumber1 = 20.53; 
		Double doubleNumber2 = 30.40; 
		Double doubleNumber3 = 80.90;
		
		String fruit1 = "Apple";
		String fruit2 = "Banana";
		String fruit3 = "Peach";

		
		findMaximumNumber(number1, number2, number3);
		findMaximumDoubleNumber(doubleNumber1, doubleNumber2, doubleNumber3);
        findMaximumString(fruit1, fruit2, fruit3);

	}

	private static void findMaximumNumber(Integer number1, Integer number2, Integer number3) 
	{
		Integer maximumNumber = number1;
		if (Integer.compare(maximumNumber, number2) == -1)
		{
			maximumNumber = number2;
		}
		if (Integer.compare(maximumNumber, number3) == -1)
		{
			maximumNumber = number3;
		}

		System.out.println("The maximum Number is "+ maximumNumber);
	}
	private static void findMaximumDoubleNumber(Double doubleNumber1, Double doubleNumber2,
			Double doubleNumber3) {
		Double maximumNumber = doubleNumber1;
		if (Double.compare(maximumNumber, doubleNumber2) == -1)
		{
			maximumNumber = doubleNumber2;
		}
		if (Double.compare(maximumNumber, doubleNumber3) == -1)
		{
			maximumNumber = doubleNumber3;
		}
		System.out.println("The maximum floating Number is "+ maximumNumber);
	}
	private static void findMaximumString(String fruit1, String fruit2, String fruit3) {
		String maximumString = fruit1;
		if (maximumString.compareTo(fruit2) < 0)
		{
			maximumString = fruit2;
		}
		if (maximumString.compareTo(fruit3) < 0)
		{
			maximumString = fruit3;
		}
		System.out.println("The maximum string is "+ maximumString);
	}
}

