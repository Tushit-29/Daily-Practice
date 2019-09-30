import java.util.Scanner;
class Fib
{
	public static int main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter value to which fibonacci series is to be made");
		int n = obj.nextInt();
		int a=0,b=1,c;
		if(n==0)
		{
			System.out.println(0);
			return ;
		}
		System.out.print(a+" ");
		System.out.print(b);
		c = a+b;
		
		for(int i=0;c<=n;i++)
		{
		
		System.out.print(" " +c);
		a = b;
		b = c;
		c = a+b;
		}
	}
}
		
		
		
