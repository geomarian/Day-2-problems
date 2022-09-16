/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Operators {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second number: ");
		int b=sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter third number: ");
		int c=sc3.nextInt();
		
		int sum1 = a+b*c;
		int sum2 = c+a/b;
		int sum3 = a%b+c;
		int sum4 = a*b+c;
				
				System.out.println(sum1+"\n"+sum2+"\n"+sum3+"\n"+sum4);
				int max=sum1, min=sum1;
				
				if(max < sum2) {
					max=sum2;
				}
				else if(max < sum3) {
					max=sum3;
				}
				else if(max < sum4) {
					max = sum4;
				}
				
				//MINIMUM
				if(min > sum2) {
					min=sum2;
				}
				else if(min > sum3) {
					min=sum3;
				}
				else if(min > sum4) {
					min = sum4;
				}
//				else {
//					System.out.println("out");
//				}
				System.out.println("Maximum result is: " + max);
				System.out.println("Minimum result is: " + min);
	
	}
	

}
