/**Program that inputs from user the radius of a circle and 
 * prints the circle's diameter, circumference and area*/

//Imports
import java.util.Scanner;

public class Area_of_a_Circle 
{
	public static void main(String[] args) 
	{
		/**INPUT BLOCK********************************/
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.print("Enter the radius of the circle: ");
		//Input
		double radius= input.nextDouble();
		
		/**CALCULATIONS********************************/
		//Declarations
		double pi= 3.1459;
		double diameter = radius*2;
		double circumference= 2 *(pi*radius);
		double area=(pi*(radius*radius));
		
		/**OUTPUT**************************************/
		System.out.printf("The diameter of the circle is: %.2f\n", diameter);
		System.out.printf("The circumeferece of the circle is: %.2f\n", circumference);
		System.out.printf("The area of the circle is: %.2f\n", area);
	}//End of Main

}//End of Area of a Circle Class
