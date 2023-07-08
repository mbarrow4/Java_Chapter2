//Text Print program 

public class Print
{

	public static void main(String[] args) //main method begins execution of program
	{
/*******************************************FORMATTED PRINTING*****************************************************/
		/**Place holders
		*INTEGER- %d
		*DOUBLE - %f
		*CHHAR- %c
		*BOOLEAN-%b
		*STRING -%s
		*/
		
		
		/**Simple Print Method using FORMATTED printing with "Hello World \n" argument*/
		System.out.printf("Hello World \n");
		
		
		/**Simple Print Method using FORMATTED printing with arguments*/
		//declaration of "number" variable
		int number = 100;
		//Printing an integer with "PRINT F" METHOD with ""%d\n", number" argument
		System.out.printf("%d\n", number);//Place holder and data
		
		
		/**Simple Print Method using FORMATTED printing with arguments*/
		//Declaration of f_number and c_charator
		float f_number = 1.1f;
		char c_character = 'm';
		//Print method with arguments 
		System.out.printf("%f\n%c\n", f_number, c_character); //Place holder and data
		
		
		/**Simple Print Method using FORMATTED printing with arguments*/
		//Declaration of "d"
		double d = 0.001;
		//Print method with arguments
		System.out.printf("%f\n", d);//Place holder and data
		
		
		/**Simple Print Method using FORMATTED printing with arguments*/
		//Declaration of "bool"
		boolean bool = true;
		//Print method with arguments
		System.out.printf("%b\n", bool);//Place holder and data
		
		/**Simple Print Method using FORMATTED printing with arguments*/
		//Declaration of "x" and "y"
		int x=10; 
		int y=7;
		//Print method with arguments
		System.out.printf("The value of %d + %d is %d%n", (x), (y),(x+y));//Place holder and data
		
/************************************************PRINT WITH NEW LINE*****************************************/
		/**Simple Print Method using print with arguments*/
		System.out.print("Hello World\n");
		
		/**Simple Print Method using "PRINTLN" with arguments*/
		System.out.println(bool);
		
		
/****PRECISION PRINTING***********************************************************************/	
	double number1=9.0;
	double number2=7.0;
	double sum=number1*number2;
	
	System.out.printf("%.2f\n", sum);

/**JUSTIFIED PRINTING****************************************************************/
	
	double num1=9.0;
	double num2=7.0;
	double sum1=num1*num2;

	System.out.printf("%20s", sum1);
	
	double amount1= 123450;
	double amount2= 75653;
	double total =amount1*amount2;
	int year=1998;

	System.out.printf("%4d%,20.2f%n", year, total);
	
	
	}//end of main

}//end of PRINT class
