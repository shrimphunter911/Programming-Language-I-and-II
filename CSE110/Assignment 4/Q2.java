import java.util.Scanner;
public class Q2
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int a=sc.nextInt();
    System.out.println("Enter your payment");
    int p=sc.nextInt();
    if(a<18 || p<10000)
    {
      System.out.println("No Tax");
    }
    else if(a>=18 && p<=20000)
    {
      double tax=p*.05;
      System.out.println(tax);
    }
    else if(a>=18 && p>20000)
    {
      double tax=p*.10;
      System.out.println(tax);
    }
  }
}