/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class ForLoopPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int rev=0, 
			rem = 0;
			
		int num = sc.nextInt();
		
		
		int temp = num;
		
		for(;num!=0;) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}
