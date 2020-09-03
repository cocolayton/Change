public class Change
{
	public static void main(String[] args)
	{
		System.out.print("hello world");
	}

	//count the number of ways to make change for a given amount of money
	//hard coded to 1, 5, 10, and 25 cent coins
	//Example: 6 cents = 2 ways (6 pennies or a nickle and a penny)
	public static int NumberOfWaysToMakeChange(int cents)
	{
		//assume cents is non-negative
		//Assume there is one way to make change for zero cents

		numWaysForQuarters = 3//1 quarter, 2 dimes and a nickle, 1 dime and 3 nickles 
		numWaysForDimes = 4; //3 ways to break up a dime (1 dime, 2 nickles, nickle and 5 pennies)
		numWaysForNickles = 2; //1 nickle or 5 pennies
		numWaysForPennies = 1;

		int ways = 1; //start at one because can have all pennies

		if (cents == 0)
		{
			ways = 1;
		}
		else if (cents >= 25)
		{
			//can have quarters + pennies
			//quarters + break down remainder into nickles and dimes and pennies
			//break down quarters

			ways++; //represents quarters + pennies

			remainder = cents%25;

			if (remainder != 0)
			{

			}

		}

		boolean done = false;
		int coin_type = 25;
		while (!done)
		{
			numCoins = cents/coin_type;
			if (numCoins != 0)
			{
				ways ++;

				remainder = cents%coin_type;
			}
		}



	}

	public static int numWaysForDimes()
	{
		int num = 4;
		
	}
}