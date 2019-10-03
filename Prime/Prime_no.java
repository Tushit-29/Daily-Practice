import java.util.Scanner;
class Prime_no
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = obj.nextInt();
		int temp=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				temp = 1;
				break;
			}
			
		}
		  if(n!=1 && n!=0 && n>0)
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
		
		
