/*program: WAP to check for leap year and take input from user 
@author: Sushma 
Date: 6th oct 2022
*/

package Corejava;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();
	    //Now we check weather the user input is correct or not ,
		// by using if and else condition
		
		if((year % 4==0)&&(year %100 ==0))
		{
		System.out.println(year + " is a leap year :");
		}
		else
		System.out.println(year +" is not a leap year :");
		}
		
		
	}


