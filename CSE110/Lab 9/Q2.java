import java.util.Scanner;
public class Q2
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a = new int[10];
    for(int i=0;i<10;i++)
    {
     System.out.println("Enter a number");
     a[i]=sc.nextInt();
    }
    System.out.println("Which to print");
    int x=sc.nextInt();
    System.out.println(a[x]);
    }
}