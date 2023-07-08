/**Program that calculates that sum, difference, product and division of a number*/
/**Program also obtains the largest number of the three*/
public class Arithmatic //Beginning of Practice Class
{

	public static void main(String[] args) //Beginning of Main
	{
	
	
	int number1= 47;	
	int number2= 7;
	int number3=7;
	
	
	
	if(number1> number2)
	{
		if(number1>number3)
		System.out.println(number1 + " is the largest number");
		
	}
	
	
	if(number2>number1) 
	{
		if(number2>number3)
			System.out.println(number2 + " is the largest number");
	}
	
	
	if(number3>number1) 
	{
		if(number3>number2)
			System.out.println(number3 + " is the largest number");
	}
	
	
	if(number1==number2) 
	{
		if(number1==number3)
		System.out.println("They are equal");
	}
	if(number1%number2==0) 
	{
		System.out.println("Number 1 is a multiple of number 2" );	
	}
	int addition = number1+number2+number3;
	int subtraction = number1-number2-number3;
	int product= number1*number2*number3;
	int division = (number1/number2)/number3;
	
	System.out.printf("Addition %d%n",addition );
	System.out.printf("Subtraction %d%n",subtraction );
	System.out.printf("Product %d%n",product );
	System.out.printf("Division %d%n",division );
	
	}//End of Main

}//End of Practice Class
