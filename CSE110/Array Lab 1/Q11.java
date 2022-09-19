import java.util.Scanner;
public class Q11
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int[] x = new int[10];
    System.out.println("Enter a number");
    x[0]=sc.nextInt();
    for(int i=1;i<=9;i++)
    {
     System.out.println("Enter a number");
     int n=sc.nextInt();
     x[i]=n;
     for(int j=0;j<i;j++)
     {
       if(x[j]==n)
       {
         i--;
       }
     }
    }
    for(int i=0;i<=9;i++)
    {
     System.out.println(x[i]);
    }
  }
}
