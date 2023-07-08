/**A simple program that determines if a number is lower , negative or higher than 100*/
//IMPORTS
import java.util.Scanner;

public class If_Else_Statements //Class Declaration
{

	public static void main(String[] args) //main method begins execution of program
	{
		/**INPUT*BLOCK************************************************/
		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.println("Type a number from 0-100");
		//Declaration on input
		int num=input.nextInt();
		
		/**IF*STATEMENT************************************************/
		if (num > 0 & num < 100) 
		{
		System.out.print("number is lower than 100");//printf METHOD
		}//end of if statement
		else if(num <0) 
		{
			System.out.print("number is negative");//printf METHOD
		}//end of else if statement
		else
			System.out.print("number is higher than 100");//printf METHOD
		//end of else statement
		
	}//end of main

}//end of class
