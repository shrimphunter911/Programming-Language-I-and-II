import java.lang.Math;
import java.util.Scanner;
public class Q6
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
      System.out.print((int)r+",");
      x=x%Math.pow(10,(c-1));
      c--;
    }
  }
}
      