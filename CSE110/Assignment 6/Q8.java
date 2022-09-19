import java.lang.Math;
import java.util.Scanner;
public class Q8
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
      if((int)r==0)
    {
      System.out.println("Zero");
    }
    else if((int)r==1)
    {
      System.out.println("One");
    }
    else if((int)r==2)
    {
      System.out.println("Two");
    }
    else if((int)r==3)
    {
      System.out.println("Three");
    }
    else if((int)r==4)
    {
      System.out.println("Four");
    }
    else if((int)r==5)
    {
      System.out.println("Five");
    }
    else if((int)r==6)
    {
      System.out.println("Six");
    }
    else if((int)r==7)
    {
      System.out.println("Seven");
    }
    else if((int)r==8)
    {
      System.out.println("Eight");
    }
    else if((int)r==9)
    {
      System.out.println("Nine");
    }
      x=x%Math.pow(10,(c-1));
      c--;
    }
  }
}
      