import java.util.Scanner;
public class Q9
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=key.nextInt();
    int divcount=0,c=1;
    while(c<n)
    {
      if (n%c==0)
      {
        divcount=divcount+c;
      }
      c++;
    }
    if(divcount==n)
    {
      System.out.println("Perfect");
    }
    else
    {
      System.out.println("Not Perfect");
    }
  }
}