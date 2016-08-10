package santhosh1;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		int i,index=0,myNumber;
		int myArray[]=new int[5];
		Scanner input=new Scanner(System.in);
		for(int count=1;count<=5;count++)
		{
		System.out.println("\nEnter value" +count+" : ");
		myNumber=input.nextInt();
		if(myNumber<10||myNumber>100)
			{
			System.out.println("\nInvalid Range");
			continue;
			}
		for(i=0;i<index;i++)
		{
			if(myArray[i]==myNumber)
				break;
		}
		if(i==index)
		{
			myArray[index]=myNumber;
			index++;
		}
		else
			System.out.println("\tDuplicate");
		}
		System.out.print("\n\nUnique numbers in the array are as follows\n\n");
		for(i=0;i<index;i++)
			System.out.print("\t"+myArray[i]);
		}
	}
		

					
