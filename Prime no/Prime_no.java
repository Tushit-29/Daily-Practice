 /* import java.util.Scanner;
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
}       */




import java.util.Scanner;
class Prime_no
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter starting no.");
		int n = obj.nextInt();
		System.out.println("enter ending no.");
		int p = obj.nextInt();
		
		
		int temp=0;
		for(int j=n;j<=p;j++)
		{  int m=n;
		 
		for(int i=2;i<=n;i++)
		{ 
			if(m%i == 0)
			{
				break;
				
			}
			System.out.println();
		
		}
		 
			 
		if(temp==0)
		{   count++;
		System.out.println("no of prime "+count);  } 
		
	    }
    }   
}

















		
		














		
		
