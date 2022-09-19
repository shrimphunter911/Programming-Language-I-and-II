import java.util.Scanner;
public class Q8
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
    for(int i=9;i>=0;i--)
    {
      if(a[i]%2==0)
       {
        System.out.println(a[i]);
       }
    }
  }
}