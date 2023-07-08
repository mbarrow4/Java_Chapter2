/**A program that determines if a number is odd or even*/

//IMPORTS
import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.println("Type a number from 0-100");
		//Declaration on input
		int num1=input.nextInt();
		
		//Prompt
		System.out.println("Type a number from 0-100");
		//Declaration on input
		int num2=input.nextInt();
	

		
	if(num1%2==0)
	{
		System.out.println("The number is even");
	}
	else 
	{
			System.out.println("The number is odd");
	}
			
	if(num2%2==0)
	{
		System.out.println("The number is even");
	}
	else 
	{
			System.out.println("The number is odd");
	}
	}

}
