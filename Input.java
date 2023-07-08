/**Simple Program that demonstrates Scanner (Input)*/

/**SCANNER REQUIREMENTS
 * 1. Import Scanner
 * 2. Scanner 
 * 3. Prompt
 * 4. Assignment of input
 * 5. Output(Optional)*/

//1. Import
import java.util.*; //import needed for input

public class Input //Class Declaration
{

	public static void main(String[] args) //main method begins execution of program
	{
		
		//2. Scanner(Starts Scanner)allows compiler to obtain input from command window
		Scanner input = new Scanner(System.in); //system.in means keyboard
		//Scanner is the data type (read input)	
		//Input is the name of the variable
				
		
		
		//3. Prompt 
		System.out.println("Type in a number TWICE: ");
		
	
		
		/**Other data types include
		 * BOOLEAN- input.nextBoolean()
		 * DOUBLE- input.nextDouble()
		 * FLOAT- input.nextFloat();
		 * */
		

		//4. To store the information
		int number = input.nextInt();
		
		//5. To output the information
		System.out.println("Your number was: "+ number);
	}//end of main function

}//end of class
