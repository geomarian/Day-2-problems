/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x1, x2, y1, y2;
       
        Scanner newnum = new Scanner(System.in);

        System.out.println("enter x1 point");
        x1 = newnum.nextInt();

        System.out.println("enter y1 point");
        y1 = newnum.nextInt();

        System.out.println("enter x2 point");
        x2 = newnum.nextInt();

        System.out.println("enter y2 point");
        y2 = newnum.nextInt();

        
        //we use Sqrt for root
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        System.out.println("distance between two points:" + "(" + x1 + "," + x1 + ")," + "(" + y2 + "," + y2 + ")===>" + distance);
    }

	

}
