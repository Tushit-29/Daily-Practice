import java.util.Scanner;
class Palin
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = obj.nextInt();
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
		int j = n%10 ;
		n = n/10 ;
		rev = rev*10 + j;
		} 
	if (temp == rev)
	    System.out.println("no. is a palindrome");
	else
	     System.out.println("no. is not palindrome");

		
		
	}
}
		
		
