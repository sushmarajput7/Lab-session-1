package CoreJava;
/*Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
@authorname-Sushma_Rajput
Date-29-09-2022
*/

import java.util.Scanner;
class Calculation
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Calculation obj = new Calculation();
//getting input value from the user
System.out.println("Enter the first number : ");
int num1 = sc.nextInt();
System.out.println("Enter the Second Number : ");
int num2 = sc.nextInt();
System.out.println("Enter the operator:1 for +,2nd for -,3rd for *,4th for / ");
int op = sc.nextInt();
switch (op) 
//performing Addition
{
case 1 :
obj.add(num1,num2);
break;
//performing Subtraction
case 2 :
obj.sub(num1,num2);	
break;
//performing Multiplication
case 3 :
obj.mul(num1,num2);
break;
//performing Division
case 4 :
obj.div(num1,num2);
break;
default:
System.out.println("Invalid Operator :");
break;
}
}
public static void add(int num1,int num2)
{
System.out.println("Addition is : "+(num1+num2));
}
public static void sub(int num1,int num2)
{
System.out.println("Subtraction is : "+(num1-num2));
}
public static void mul(int num1,int num2)
{
System.out.println("Multiplication is : "+(num1*num2));
}
public static void div(int num1,int num2)
{
System.out.println("Division is : "+(num1/num2));
}
}
