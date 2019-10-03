 import java.util.Scanner;
class Prime_no
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = obj.nextInt();
		int temp=0;
		for(int i=2;i<=n/2+1;i++)
		{
			if(n%i == 0)
			{
				temp = 1;
				break;
			}
			
		}
		  if(n>2) 
		  {
			 
		if(temp==1)
		    System.out.println("not prime ");
		else
		    System.out.println(" is prime no.");
		  }
			else
			   System.out.println("not prime");
			  
	}
}   



/*
import java.util.Scanner;
class Prime_no
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the range");
		int n = obj.nextInt();
		int temp=0,count=0;
		for(int j=2;j<=n;j++)
		{  int m=n;
		for(int i=2;i<=m/2+1;i++)
		{ 
			if(m%i == 0)
			{
				break;
				temp=1
			}
		
			
		}
		 
			 
		if(temp==0)
		{   count++;
		System.out.println("no of prime "+count);  } 
		
	}
}   
 */

















		
		














		
		
