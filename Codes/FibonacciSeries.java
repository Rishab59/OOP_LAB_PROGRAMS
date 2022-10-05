import java.util.Scanner ;
public class FibonacciSeries
{
	public static void main(String []array)
	{
		Scanner s = new Scanner(System.in) ;
		System.out.print("Fibonacci Series\nEnter no.of items to be printed :\t") ;
		int n = s.nextInt() ;
		int a = 0, b = 1, c = 0 ;
		System.out.print("\n0\t1\t") ;
		for(int i = 0 ; i <= n-2 ; i++)
		{
			c = a + b ;
			a = b ;
			b= c ;
			System.out.print(c+"\t") ;
		}
	}
}