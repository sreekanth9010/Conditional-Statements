package conditionalStatements;

import java.util.Scanner;

public class Comaprision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		//creating a scanner object to take input from the user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1=sc.nextInt();
		System.out.println("Enter num2 value :");
		num2=sc.nextInt();
		
		System.out.println("Enter num3 value :");
		num3=sc.nextInt();
		//closing the scanner object
		sc.close();
		
		// if-else execution
		
		if(num1>num2 && num1>num3)
			//if block
		{
			System.out.println("The greatest among the three variables is :"+num1);
		}
		else if(num2>num3)
			//else- if block
		{
			System.out.println("The greatest among the three variables is :"+num2);
		}
		else
		{
			System.out.println("The greatest among the three variables is :"+num3);
		}

	}

}
