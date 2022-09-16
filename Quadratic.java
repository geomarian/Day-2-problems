/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value A: ");
		double a = input.nextDouble();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter value B: ");
		double b = input.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter value C: ");
		double c = input.nextDouble();
		
		double d=b*b-4.0*a*c; //formula
		if(d>0 ) {
			double r1 =(-b + Math.pow(d, 0.5)) / (2.0*a);
			double r2 =(-b + Math.pow(d, 0.5)) / (2.0*a);
			System.out.println("The roots are " + r1 + "and" + r2);
		}
		else if(d==0.0) {
			double r1 = -b/(2.0*a);
			System.out.println("The root is " + r1);
		}
		else {
			System.out.println("Roots are not real");
		}
	}

}
