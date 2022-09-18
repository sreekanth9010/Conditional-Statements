package conditionalStatements;

import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		//creating a scanner object to take input from the user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1=sc.nextInt();
		System.out.println("Enter num2 value :");
		num2=sc.nextInt();
		//closing the scanner object
		sc.close();
		System.out.println("The greatest number is :");
		
		//if-else block
		
		if(num1>num2)
			//if block
		{
			System.out.println(num1);
		}
		else 
			//else block
		{
		System.out.println(num2);	
		}
	
	
	
	}

}
