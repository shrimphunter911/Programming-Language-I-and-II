import java.util.Scanner;
public class Q5
{
  public static void main (String [] args)
  {
    Scanner key = new Scanner(System.in);
    int i=1,n=20;
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
    