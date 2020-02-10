package com.epam.calculator.mavencalc;

import java.util.Scanner;

public class CalcTest 
{
	public static void main(String[] args) 
	{
		Calc c=new Calc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
		int ch=sc.nextInt();
		System.out.println("enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch (ch) {
		case 1:System.out.println("sum= "+c.add(a,b));			
			   break;
		case 2:System.out.println("difference= "+c.subt(a,b));			
		       break;
		case 3:System.out.println("product= "+c.mul(a,b));			
		       break;
		case 4:System.out.println("quotient= "+c.div(a,b));			
		       break;
		default:System.out.println("Enter choice between 1 to 4");
			   break;
		}
		
		
	}

}
