import java.util.*;
public class pascal
{
   public static void main(String[] args)
   {
      int row, i, j, space, num;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no. of rows: ");
	if(!sc.hasNextInt())
	{
		System.out.println("Invalid Enter only integers");
		return;
	}
      row=sc.nextInt();
      for(i=0; i<row; i++)
      {
         for(space=row; space>i; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+" ");
            num = num*(i-j)/(j+1);
         }
         System.out.println();
      }
   }
}
