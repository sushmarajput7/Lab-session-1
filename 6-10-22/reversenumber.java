/*program: WAP to find the Reverse of a Number 
@author: Sushma
Date: 6th oct 2022
*/
package Corejava;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//talking the input from the user
		System.out.println("Enter the Number :"); 
	    int number = sc.nextInt();
	    int reverse = 0;
	    System.out.println("Enter the number : ");
        //we use while loop to execute the condition
	    while(number!=0)
	    {
	    //we can check condition and divide by 10
	    int remainder = number%10;
	    //now add the remainder to the number and number divided by 10
	    reverse = reverse *10+remainder;
	    number = number/10;
	    }
	    System.out.println("The reverse of a given number is : "+reverse);

		

	}

}
