/**Program that reads in 5 numbers(hard coded) and determine the smallest and largest*/
public class Largest_Smallest_Ints 
{

	public static void main(String[] args) 
	{
		//Declarations
		int one = 212;
		int two =3421;
		int three =1;
		int four = 17;
		int five =-89;
	/***LARGEST****************************************************************/	
		//ONE
		if (one> two && one> three && one>four && one> five)
			{
			System.out.println("ONE is the LARGEST number");
			}
		
		//TWO
		if (two > one && two > three && two >four && two> five)
			{
			System.out.println("TWO is the LARGEST number");
			}
		
		//THREE
		if (three > two && three > one && three > four && three > five)
			{
				System.out.println("THREE is the LARGEST number");
			}
		//FOUR
		if (four> two && four > three && four> one && four > five)
			{
				System.out.println("FOUR is the LARGEST number");
			}
		//FIVE
		if (five > two && five > three && five >four && five > one)
			{
				System.out.println("FIVE is the LARGEST number");
			}
				
		/***SMALLEST****************************************************************/ 
		//ONE
		if (one< two && one< three && one<four && one< five)
		{
		System.out.println("ONE is the SMALLEST number");
		}
		//TWO
		if (two < one && two < three && two <four && two< five)
		{
		System.out.println("TWO is the SMALLEST number");
		}
		//THREE
		if (three < two && three < one && three < four && three < five)
		{
		System.out.println("THREE is the SMALLEST number");
		}
		//FOUR
		if (four< two && four < three && four< one && four < five)
		{
		System.out.println("FOUR is the SMALLEST number");
		}
		//FIVE
		if (five < two && five < three && five <four && five < one)
		{
		System.out.println("FIVE is the SMALLEST number");
		}

		
		
	}//End of Main
}//End of Largest_Smallest_Int Class
