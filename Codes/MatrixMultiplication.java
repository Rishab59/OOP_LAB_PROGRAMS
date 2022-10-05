import java.io.* ;
import java.util.Scanner ;
public class MatrixMultiplication 
{
	public static void main(String [] array) 
	{
		System.out.print("Matrix Multiplication\n") ;
		int r1, r2, c1, c2 ;
		Scanner s = new Scanner(System.in) ;
		System.out.print("For First matrix\nEnter no.of rows :\t") ;
		r1 = s.nextInt() ;
		System.out.print("\nEnter no.of columns :\t") ;
		c1 = s.nextInt() ;
		System.out.print("\nFor Second matrix\nEnter no.of rows :\t") ;
		r2 = s.nextInt() ;
		System.out.print("\nEnter no.of columns :\t") ;
		c2 = s.nextInt() ;
		if(c1 != r2)
		{
			System.out.println("\nMatrix multiplication is not possible.") ;
			System.exit(0) ;
		}
		int i, j, k ;
		int [][] firstMatrix = new int [r1][c1] ;
		int [][] secondMarix = new int [r2][c2] ;
		System.out.println("\nEnter the elements of First Matrix :") ;
		for (i = 0 ; i < r1 ; i++)
		{
			for(j = 0 ; j < c1 ; j++)
			{
				firstMatrix[i][j] = s.nextInt() ;
			}
		}
		System.out.println("Enter the elements of Second Matrix :");
		for (i = 0 ; i < r2 ; i++)
		{
			for(j = 0 ; j < c2 ; j++)
			{
				secondMarix[i][j] = s.nextInt() ;
			}
		}
		int [][] product = new int [r1][c2] ;
		for(i = 0 ; i < r1 ; i++)
		{
			for(j = 0 ; j < c2 ; j++)
			{
				for(k = 0 ; k < c1 ; k++)
				{
					product[i][j] += firstMatrix[i][k] * secondMarix[k][j] ;
				}
			}
		}
		System.out.println("Multiplication of given two matrix is :");
		for(int row[] : product)
		{
			for(int column : row)
			{
				System.out.print(column + " ") ;
			}
			System.out.println() ;
		}	
	}
}