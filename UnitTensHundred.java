/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class UnitTensHundred {

	/**
	 * @param args
	 */
	static int a = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		if(a==1) {
			System.out.println("Digit is unit");
		}
		else if(a==10) {
			System.out.println("Digit is Tens");
		}
		else if(a==100) {
			System.out.println("Digit is Hundred");
		}
		else if(a==1000) {
			System.out.println("Digit is Thousand");
		}
		else {
			System.out.println("Number is out of Range");
		}
	}

}
