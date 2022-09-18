package conditionalStatements;

import java.util.Scanner;

public class Comparision4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		float num4;
		//creating a scanner object to take input from the user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1=sc.nextInt();
		System.out.println("Enter num2 value :");
		num2=sc.nextInt();
		
		System.out.println("Enter num3 value :");
		num3=sc.nextInt();
		System.out.println("Enter num4 value :");
		num4=sc.nextFloat();
		
		//closing the scanner object
		sc.close();
		
		if(num1 > num2 && num1>num3 && num1>num4)
		{
			System.out.println("The greatest among all 4 is :"+num1);
			
		}
		else if(num2>num3 && num2>num4)
		{
			System.out.println("The greatest among all 4 is :"+num2);
			
		}
		else if(num3>num4)
		{
			System.out.println("The greatest among all 4 is :"+num3);
		}
		else
		{
			System.out.println("The greatest among all 4 is :"+num4);
		}
		
		
		
		
		

	}

}
