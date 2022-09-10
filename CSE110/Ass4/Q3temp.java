import java.util.Scanner;
public class Q3temp
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of s");
    double s=sc.nextDouble();
    double q;
    q=(s*s)/14900;
    System.out.println("L="+q);
  }
}