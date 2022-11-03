/*
 * Write a Java program to calculate the average value of array elements.
 * @Author "Sushma Rajput"
 * Date - 20/10/2022
 */
package Corejava;
import java.util.Scanner;
class Arrayaverage 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//Enter the size of Array
System.out.println("Enter The Size of Array : ");
int num = sc.nextInt();
//Array Elements 
System.out.println("Enter the Array Elements : ");
int arr[] = new int[num];
//default value sum
int sum = 0;
//sum of all values in array using for loop
for (int i = 0; i < arr.length; i++) 
{
	arr[i]=sc.nextInt();
    sum += arr[i];
}
double average = sum / num;
System.out.println("Average of array : " + average);
}
}