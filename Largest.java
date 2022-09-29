package CoreJava;
/*
Program: Current version of Java
@author: Sushma
@date: 29th sept 2022
*/

import java.util.Scanner;

class Largest
{
  public static void main(String[] args)
  {
     int numberOne, numberTwo, largest;
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Enter the First Number: ");
     numberOne = scan.nextInt();
     System.out.print("Enter the Second Number: ");
     numberTwo = scan.nextInt();
     
     if(numberOne>numberTwo)
        largest = numberOne;
     else
        largest = numberTwo;
     
     System.out.println("\nLargest = " +largest);
  }
}
