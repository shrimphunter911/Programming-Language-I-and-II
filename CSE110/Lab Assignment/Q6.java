import java.util.Scanner;
public class Q6
{
  public static void main (String [] args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter a quantity");
    int i=1,n=key.nextInt();
    while(i<=n)
    {
      System.out.println("Enter a number");
      int x=key.nextInt();
      if(x%2==0)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
      i++;
    }
  }
}
    