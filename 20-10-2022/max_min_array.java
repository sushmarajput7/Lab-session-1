/*
 * Write a Java program to find the maximum and minimum value of an array.
 * @Author "Sushma Rajput"
 * Date - 20/10/2022
 */
package Corejava;
import java.util.Scanner;
class Max_Min_Array
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//enter the size of Array
System.out.println("Enter the size of Array : ");
int num = sc.nextInt(); 
//initialization of Array
int arr[] = new int[num];
System.out.println("Enter the Array Elements : ");
int max = 0;
for(int i = 0; i < arr.length; i++)
{   arr[i] = sc.nextInt();
	//find the maximum Element of an Array
	if(arr[i]>max)
	{
		max = arr[i];
	}	
}
System.out.println("The maximum value is : "+max);
int min = arr[0];
for(int i = 0;i<arr.length;i++)
{
	if(arr[i]< min)
	{
		min = arr[i];
	}
}
System.out.println("The minimum value is : "+min);
}
}
