package santhosh1;
import java.util.Scanner;
public class Date {
	int mo,day,yr;
	public Date()
	{
		mo=day=yr=0;
	}
	public void setMo(int x)
	{
		this.mo=x;
	}
	public void setDay(int y)
	{
		this.day=y;
	}
	public void setYr(int z)
	{
		this.yr=z;
	}
	Scanner input=new Scanner(System.in);
	public void getMo()
	{
		int m=input.nextInt();
		setMo(m);
	}
	public void getDay()
	{
		int d=input.nextInt();
		setDay(d);
	}
	public void getYr()
	{
		int i=input.nextInt();
		setYr(i);
	}
	public void displayDate()
	{
		System.out.print("Date(dd/mm/yyyy) : "+day+"/"+mo+"/"+yr);
	}
	public static void main(String[] args) 
	{
		Date t=new Date();
		System.out.print("Day : ");
		t.getDay();
		System.out.print("Month : ");
		t.getMo();
		System.out.print("Year : ");
		t.getYr();
		System.out.println();
		t.displayDate();
	}

}
