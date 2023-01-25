package program_2;

import java.util.*;


public class program_2 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		double fahrenheit;
		double celsius;
		
		System.out.println("Enter a Fahrenheit temperature:");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit -32)*5/9;
		
		System.out.println(Double.toString(fahrenheit) + " Fahrenheit is " + celsius + " Celsius");
	

	}

}
