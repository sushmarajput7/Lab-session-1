/* WAP to check the condition for checking the correct password using If-Else.Take input from the user.
Author-Sushma
Date-6/10/2022
*/
package Corejava;

import java.util.Scanner;

public class Checkpassword {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User_Name : ");
		//we use string for taking input from the user
		String name = sc.nextLine();
		System.out.println("Enter your Password : ");
		int password=sc.nextInt();	
		//if condition to check if the password is correct or not
		if(password==123456)
		{
		System.out.println(name +" Login Successful..");	
		}
		else
		System.out.println(name +" your password is incorrect..Try Again");	
		}
		

}


