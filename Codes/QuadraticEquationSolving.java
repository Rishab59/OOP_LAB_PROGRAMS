import java.util.Scanner ;
import java.io.* ;
public class QuadraticEquationSolving
{
	public static void main(String []array)
	{
		Scanner s = new Scanner(System.in) ;
		double a, b, c, r1, r2 ;
		System.out.println("\nRoots of quadratic equation\nThe format is\nax2+bx+c") ;
		System.out.print("Enter a value :\t") ;
		a = s.nextInt() ;
		System.out.print("\nEnter b value :\t") ;
		b = s.nextInt() ;
		System.out.print("\nEnter c value :\t") ;
		c = s.nextInt() ;
		double det = b*b - 4*a*c ;
		if(det > 0)
		{
			r1 = (-b + Math.sqrt(det)) / (2*a) ;
			r2 = (-b - Math.sqrt(det)) / (2*a) ;
			System.out.format("\nr1 = %.2f\nr2 = %.2f\nRoots are Real and Distinct.", r1, r2) ;
		}
		else if(det == 0)
		{
			r1 = r2 = -b / (2*a) ;
			System.out.format("\nr1 = %.2f\nr2 = %.2f\nRoots are Real and Equal.", r1, r2) ;
		}
		else
		{
			double real = -b / (2*a) ;
			double img = Math.sqrt(-det) / (2*a) ;
			System.out.format("\nr1 = %.2f + %.2f i", real, img) ;
			System.out.format("\nr2 = %.2f + %.2f i", real, img) ;
			System.out.print("\nRoots are imaginary.") ;
		}
	}
}