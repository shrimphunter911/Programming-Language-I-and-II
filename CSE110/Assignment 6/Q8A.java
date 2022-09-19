import java.lang.Math;
import java.util.Scanner;
public class Q8A
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int c=0;
    double x=n;
    while(n>=1)
    {
      c++;
      n=n/10;
    }
    while(x>=1)
    {
      double r=x/Math.pow(10,(c-1));
      String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
      for(int i=0;i<10;i++)
      {
        if((int)r==i)
        {
          System.out.println(a[i]);
        }
      }
      x=x%Math.pow(10,(c-1));
      c--;
    }
  }
}