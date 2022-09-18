package conditionalStatements;

import java.util.Scanner;

public class Ternary {
	
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
		int result=(num1>num2)?num1:num2;
		System.out.println("The greatest number of 2 is :"+result);
	}

}
