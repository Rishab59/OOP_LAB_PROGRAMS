import java.util.Scanner ;
import java.io.* ;
public class StringSorting
{
	public static void main(String []array)
	{
		Scanner s  =  new Scanner(System.in) ;
		String temp ;
		System.out.print("String Sorting\nEnter no.of Strings :\t") ;
		int n = s.nextInt() ;
		String str[] = new String[n] ;
		System.out.println("\nEnter Strings :") ;
		int i, j ;
		for(i = 0 ; i < n ; i++)
		{
			str[i] = s.next() ;
		}
		for (i = 0 ; i < n ; i++)
		{
			for(j = 0 ; j < n ; j++)
			{
				if((str[i].compareTo(str[j])) < 0)
				{
					temp = str[i] ;
					str[i] = str[j] ;
					str[j] = temp ;
				}
			}
		}
		System.out.println("\nSorted Strings :") ;
		for(i = 0 ; i < n ; i++)
		{
			System.out.println(str[i]) ;
		}
	}
}