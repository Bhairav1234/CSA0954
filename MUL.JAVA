import java.util.Scanner;

public class mul_table {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        System.out.print("Enter number upto:");
        int a=sc.nextInt();
        
        
        for(int i = 1; i <= a; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
