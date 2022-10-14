import java.io.* ;
interface Mystack
{
	public void pop() ;
	public void push() ;
	public void display() ;
}
class Stack_array implements Mystack
{
	final static int n = 5 ;
	int [] stack = new int[n] ;
	int top = -1 ;
	public void push()
    {
		try
        {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
			if(top == (n-1))
            {
				System.out.println("\nStack Overflow") ;
				return ;
            }
			else
            {
				System.out.print("\nEnter the element :\t") ;
				int ele = Integer.parseInt(br.readLine()) ;
				stack[++top] = ele ;
            }
        }
		catch(IOException e)
        {
			System.out.println("e") ;
        }
    }
	public void pop()
    {
		if(top < 0)
       	{
			System.out.println("\nStack underflow") ;
			return ;
        }
		else
        {
			int popper = stack[top] ;
			top-- ;
			System.out.println("\nPopped element : " + popper) ;
	    }
    }
	public void display()
    {
		if(top < 0)
       	{
			System.out.println("\nStack is empty") ;
			return ;
  	    }
		else
        {
            String str = "" ;
			for(int i = 0 ; i <= top ; i++)
			str = str + "" + stack[i] + "<--" ;
			System.out.println("\nElements are :\t" + str) ;
        }
    }
}
class StackADT
{
	public static void main(String [] array) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Implementation of Stack using Array") ;
		Stack_array stk = new Stack_array() ;
		int ch = 0 ;
		do
        {
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit") ;
			System.out.print("Enter your choice :\t") ;
			ch = Integer.parseInt(br.readLine()) ;
			switch(ch)
			{
				case 1:
					stk.push() ;
					break ;
				case 2:
					stk.pop() ;
					break ;
				case 3:
					stk.display() ;
					break ;
				case 4:
					System.exit(0) ;
				default:
					System.out.println("\nInvaid Choice") ;
			}
        }
		while(ch < 5) ;
  	}
}
