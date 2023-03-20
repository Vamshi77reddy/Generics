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
		
		findMaximumDoubleNumber(doubleNumber1, doubleNumber2, doubleNumber3);

		findMaximumNumber(number1, number2, number3);
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
}

