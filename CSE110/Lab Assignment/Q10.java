import java.util.Scanner;
public class Q10
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=key.nextInt();
    int divcount=0,c=1;
    while(c<=n)
    {
      if (n%c==0)
      {
        divcount++;
      }
      c++;
    }
    if(divcount<=2)
    {
      System.out.println("Prime");
    }
    else
    {
      System.out.println("Not Prime");
    }
  }
}