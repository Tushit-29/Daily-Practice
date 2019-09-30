import java.util.Scanner;
class Facto
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the no. of which factorial is to find");
		int n = obj.nextInt();
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans = ans*i  ;
		}
		if(n<0)
			System.out.println("wrong input");
		else	
		    System.out.println("factorial of the no. is " + ans);
	}
}
		
		
		