import java.util.Scanner;
public class Q3
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of s");
    double s=sc.nextDouble();
    double l;
    if(s<100)
    {
      l=3000-125*s*s;
    }
    else 
    { 
      double q;
    q=4+(s*s/14900);
      l=12000/q;
    }
    System.out.println("L="+l);
  }
}