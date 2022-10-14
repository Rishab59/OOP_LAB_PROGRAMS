import java.util.Scanner ;
abstract class Shapes
{
	public int x, y ;
	public abstract void printArea() ;
	float area ;
}
class Rectangle extends Shapes
{
	public void printArea()
	{
		area = x * y ;
		System.out.println("\nArea of Rectangle is : " + area) ; 
	}
}
class Triangle extends Shapes
{
	public void printArea()
	{
		area = (x * y) / 2 ;
		System.out.println("\nArea of Triangle is : " + area) ;
	}
}
class Circle extends Shapes
{
	public void printArea()
	{
		area = (22 * x * x) / 7 ;
		System.out.println("\nArea of Circle is : " +  area) ;
	}
}
public class Shape
{
	public static void main(String [] array)
	{
		Scanner s = new Scanner(System.in) ;
		System.out.print("Area of a Shape\n1.Rectangle\n2.Triangle\n3.Circle\nEnter your choice :\t") ;
		int choice = s.nextInt() ;
		int x1, y1 ;
		switch(choice)
		{
			case 1:
				Rectangle r = new Rectangle() ;
				System.out.println("\nFor Rectangle\nEnter Length and Breath value :") ;
				x1 = s.nextInt() ;
				y1 = s.nextInt() ;
				r.x = x1 ;
				r.y = y1 ;
				r.printArea() ;
				break ;
			case 2:
				Triangle t = new Triangle() ;
				System.out.println("\nFor Triangle\nEnter Base and Height value :") ;
				x1 = s.nextInt() ;
				y1 = s.nextInt() ;
				t.x = x1 ;
				t.y = y1 ;
				t.printArea() ;
				break ;
			case 3:
				Circle c = new Circle() ;
				System.out.print("\nFor Circle\nEnter Radius value :\t") ;
				x1 = s.nextInt() ;
				c.x = x1 ;
				c.printArea() ;
				break ;
			default:
				System.out.print("\nInvalid Choice") ;
		}
	}
}