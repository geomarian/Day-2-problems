/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class ForLoopReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 789;
		int reverse = 0;
		
		for(;number != 0; number/=10 ) {
			int lastDigit = number%10;
			reverse =reverse *10+lastDigit;
			
		
		System.out.println("reverse number is " + reverse);
		
		
		}}

}
