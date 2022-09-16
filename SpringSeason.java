
/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class SpringSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Day: ");
		int day=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Month: ");
		int month= sc2.nextInt();
		
		if(day>=20 && day<=31) {
			System.out.println("Day is True");
		}
		
		else {
			System.out.println("Day is False");
		}
		if (month >= 3 && month <= 6) 
		{
			System.out.println("Month is True");
		}
		else {
			System.out.println("Month is False");
		}
	}

}
