/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class SwitchCaseVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet:  ");
		char ch=scan.next().charAt(0);
		switch(ch){
		   
		    case 'a':
	    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'e':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'i':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'o':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'u':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		
		    default:
		    System.out.println(ch+" is a consonant");
		    break;
		    
		    
		}
		}
		   
	}


