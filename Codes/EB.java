import java.util.Scanner ;
public class EB
{
	public static void main(String args[])
	{
		double amt ;
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter your card no : \t") ;
		int cno = sc.nextInt() ;
		System.out.print("\nEnter your name :\t") ;
		String cname = sc.next() ;
		System.out.print("\nEnter your previous reading :\t") ;
		int previous = sc.nextInt() ;
		System.out.print("\nEnter your current reading :\t") ;
		int current = sc.nextInt() ;
		System.out.print("\n1.Domestic\n2.Commercial\nEnter your connection type :\t") ;
		int type = sc.nextInt() ;
		double units = current - previous ;
		double dunits = units - 100 ;
		switch(type)
		{
			case 1:
				if(units <= 100)
				{
					amt = units ;
				}
				else if(dunits <= 200 && dunits >= 101)
				{
					amt = 100 + (dunits * 2.50) ;
				}
				else if(dunits <= 500 && dunits >= 201)
				{
					amt = 100 + (dunits * 4) ;
				}
				else
				{
					amt = 100 + (dunits * 6);
				}
				System.out.print("\nCustomer no :\t" + cno + "\nCustomer name :\t" + cname + "\nUnits :\t" + units + "\nBill Amt :\t" + amt ) ;
				break ;
			case 2:
				if(units <= 100)
				{
					amt = units * 2 ;
				}
				else if(dunits <= 200 && dunits >= 101)
				{
					amt = 100 + (dunits * 4.50) ;
				}
				else if(dunits <= 500 && dunits >= 201)
				{
					amt = 100 + (dunits * 6) ;
				}
				else
				{
					amt = 100 + (dunits * 7) ;
				}
				System.out.print("\nCustomer no :\t" + cno + "\nCustomer name :\t" + cname + "\nUnits :\t" + units + "\nBill Amt :\t" + amt ) ;
				break ;
			default:
				System.out.print("\nYour choice is invalid") ;
		}
	}
}
