import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    float num1;
	    float num2;
	    float num3;
	    float monthly;
	    
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee:");
	    String name=sc.nextLine();
		
		System.out.println("Enter the date of birth of the employee:");
		num1=sc.nextFloat();
		
		System.out.println("Enter the month of birth of the employee:");
		num2=sc.nextFloat();
		
		System.out.println("Enter the year of birth of the employee:");
		num3=sc.nextFloat();
		
		System.out.println("Enter the monthly salary of th employee:");
		monthly=sc.nextFloat();
		
        
		double tax;
		double tax1;
		double tax2;
		double tax3;
		
		
		if(monthly==500000)
		{
		    tax=monthly/5;
		    System.out.println("You are supposed to pay "+tax+"as annual tax.");
		}
		else if(monthly==400000)
		{
		    tax1=400000/6.67;
		    System.out.println("You are supposed to pay "+tax1+" as annual tax.");
		}
		else if(monthly==300000)
		{
		    tax2=monthly/10;
		    System.out.println("You are supposed to pay "+tax2+" as annual tax.");
		}
		else if(monthly==200000)
		{
		    tax3=monthly/20;
		    System.out.println("You are supposed to pay "+tax3+" as annual tax.");
		}
		else
		{
		    System.out.println("You are not supposed to pay any tax ammount i.e $0");
		}
		
		System.out.println("The name of the employee is "+name+" . And your annual salary is "+monthly+" So you are supposed to pay the above printed tax.");
	}
	
} 