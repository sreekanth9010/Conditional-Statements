package conditionalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day in numbers between 1-7 :");
		day=sc.nextInt();
		sc.close();
		
		switch(day)
		{
			case 1:
				
				//we can have a block of anything under each case:
			{
				System.out.println("MONDAY");
				System.out.println("Have a good day");
				break;		
			}
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNSDAY");
				break;
			case 4:
				System.out.println("THURSDAY");	
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			case 7:
				System.out.println("SUNDAY");
				break;
			default:
				System.out.println("please choose a valid number ...!");
		}
	}

}
