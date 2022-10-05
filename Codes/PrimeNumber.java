import java.util.Scanner ;
public class PrimeNumber
{
    public static void main(String [] array) 
	{
        Scanner s = new Scanner(System.in) ;
        System.out.print("Enter a number to check if it is truly prime number or not :\t") ;
        int n= s.nextInt() ;
        if(isPrime(n)) 
		{
            System.out.print("\n" + n + " is prime number.") ;
        }
        else
		{
            System.out.print("\n" + n + " is a non-prime number.") ;
        }
    }
    static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false ;
        }
		for(int i = 2 ; i <= num/2 ; i++)
		{
			if((num % i) == 0)
			{
				return  false ;
		    }
		}
		return true ;
    }
}