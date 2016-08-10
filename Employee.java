package santhosh1;
import java.util.Scanner;
public class Employee {
	String firstName;
	String lastName;
	double salary;
	public Employee()
	{
		firstName="\0";
		lastName="\0";
		salary=0.0;
	}
	public void setFirstName(String x)
	{
		this.firstName=x;
	}
	public void setLastName(String y)
	{
		this.lastName=y;
		//System.out.println("hi");
	}
	public void setSalary(double z)
	{
		if(z>0.0)
			this.salary=z;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public double annualIncome()
	{
		return(salary*12);
	}
	public double incre()
	{
		double x=((double)1/10)*(salary*12);
		return (x+salary*12);
	}
	public static void main(String[] args)
	{   
		Scanner input=new Scanner(System.in);
		Employee e1=new Employee();
		System.out.println("\n\nEnter the details of the customers!\nEmployee 1 : ");
		System.out.print("First Name : ");
		String s=input.nextLine();
		e1.setFirstName(s);
		System.out.print("Last Name : ");
		String t=input.nextLine();
		e1.setLastName(t);
		System.out.print("\nMonthly Salary : ");
		double r=input.nextDouble();
		e1.setSalary(r);
		Employee e2=new Employee();
		System.out.println("\n\nEmployee 2 : ");
		System.out.print("First Name : ");
		String w=input.next();
		e2.setFirstName(w);
		System.out.print("Last Name : ");
		String v=input.next();
		e2.setLastName(v);
			
		
		System.out.print("\nMonthly Salary : ");
		double l=input.nextDouble();
		e2.setSalary(l);
		System.out.println("\n\n\n\t\t\tEMPLOYEE DETAILS");
		System.out.println("\t\t\t\t\t\tEmPlOyEe 1");
		System.out.print("\tFIRST NAME : "+e1.getFirstName()+"\n\tLAST NAME : "+e1.getLastName());
		System.out.print("\n\tMONTHLY SALARY : "+e1.getSalary()+"\n\tANNUAL INCOME : "+e1.annualIncome()+"\n\tINCREASED SALARY :"+e1.incre());
		System.out.println("\n\t\t\t\t\t\tEmPlOyEe 2");
		System.out.print("\tFIRST NAME : "+e2.getFirstName()+"\n\tLAST NAME : "+e2.getLastName());
		System.out.print("\n\tMONTHLY SALARY : "+e2.getSalary()+"\n\tANNUAL INCOME : "+e2.annualIncome());
		System.out.print("\n\tINCREASED SALARY : "+e2.incre());
	}
}
