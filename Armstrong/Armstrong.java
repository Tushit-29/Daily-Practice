import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a no");
		int n = obj.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rev = n%10;
		    n = n/10;
			sum = sum+rev*rev*rev;
		}
		if(temp==sum)
		    System.out.println("given no. is armstrong no");
		else
		   System.out.println("given no. is not armstrong no");
	}
}
		    