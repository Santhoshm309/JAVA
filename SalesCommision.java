package santhosh1;

import java.util.Scanner;

public class SalesCommision{
	public static void main(String[] args) {
		
			int[] salaries = {0,0,0,0,0,0,0,0,0,0,0};
			//function call to get wages
			wages(salaries);
			display(salaries);
			System.exit(0);
	}	
		public static void wages(int money[])
		{
			Scanner keyboard = new Scanner(System.in);
			double sales,i=0.09;
			System.out.println("Enter empoyee gross sales(-1 to end):");
			sales = keyboard.nextInt();
			while(sales != -1)
			{
				double salary = 200.0+sales*i;
				System.out.println("\nEmployee Commision is $"+salary);
				int x =(int)salary/100;
				++money[(x<10?x:10)];
				System.out.println("\nEnter employee gross sales (-1 to end");
				sales = keyboard.nextInt();
			}	}
		
		public static void display( int dollars[] )
		{
			System.out.println("Employees in the range:");
			for(int i=2;i<10;++i)
				System.out.print("\n$"+i+"00-$" +i+"99:"+dollars[i]);
			System.out.print("\nOver $1000: "+dollars[10]);
		}
	

				
			
	}
		
	




