import java.util.Scanner;
public class Q10
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a = new int[10];
    for(int i=0;i<10;i++)
    {
     System.out.println("Enter a number");
     a[i]=sc.nextInt();
     for(int j=0;j<=i;j++)
     {
       if(j==i)
       {
       System.out.print(a[j]);
       }
       else
       {
       System.out.print(a[j]+",");
       }
     }
     System.out.println();
    }
  }
}