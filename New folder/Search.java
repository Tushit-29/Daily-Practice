import java.util.Scanner;
class Search
{
   public static void main(String args[])
    {
	  Scanner obj = new Scanner(System.in);
      System.out.println("enter the total no. of elements");	
      int tot =  obj.nextInt();

      int a[] = new int[tot];
      int sum=0;
      System.out.println("enter the values"); 

      for(int j=0;j<tot;j++)
         {    
	        a[j] = obj.nextInt();
		 }

	int temp = 0;

	System.out.println("enter the no. to be searched");
	int s = obj.nextInt();
	for(int i=0;i<tot;i++)
	{
	if(a[i] == s)
		{ temp=1;
		System.out.println("item found at index " + i);
		break;
		}
	}
	if (temp==0)
       System.out.println("item not found");
	}
}
  
  
  
  

