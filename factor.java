import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
	    System.out.print("Enter the number : ");
	    int x = in.nextInt(); 
	    System.out.println("Number of factors of is : " +result(x));
	    if(x<=0)
	    {
	        System.out.println("Enter valid input");
	    }
	} 		
	
	public static int result(int num) 
	{	
		int ctr = 0;
		for(int i=1; i<=(int)Math.sqrt(num); i++)
	    {
	        if(num%i==0 && i*i!=num)
	        {
	            ctr+=2;
	        } 
	        else if (i*i==num) 
	        {
	            ctr++;
	        }
	    }
	        return ctr;
	}   
}

