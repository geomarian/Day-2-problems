/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class WhileLopp_Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 765432;
		int reverse = 0;
		int lastDigit;
		
		while(number > 0)   
		{  
			
			lastDigit = number%10;
			reverse = reverse * 10 + lastDigit; 
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		  
	

}
