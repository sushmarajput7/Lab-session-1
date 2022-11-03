/*
 * WAP to sort String Array in Descending order.
@Author-Sushma Rajput
Date - 27-10-2022
 */
package Corejava;

import java.util.Scanner;

class sort_array_in_dec {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Array size
		System.out.println("Enter the String Elements");
		String alpha = sc.nextLine();
		//array Elements 
		System.out.println("Sort in Descending Order");
		char arr[] = alpha.toCharArray();
		System.out.println("Reverse of a string");
		int i = arr.length;
		for(int j=i;j>0;j--)
		{
		System.out.println(arr[j-1]);
		}
		sc.close();
		}
		
		

}


