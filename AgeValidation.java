package conditionalStatements;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the age :");
		age=sc.nextInt();
		sc.close();
		if(age>=18)
		{
			System.out.println("you are allowed....!");
		
		}
		else
		{
			System.out.println("you are  not allowed....!");
		}
	}

}
