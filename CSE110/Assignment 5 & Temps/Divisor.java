import java.util.Scanner;
public class Divisor
{
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner ( System.in );
    System.out.println("Enter a number");
      int x = keyboard.nextInt();
      int divcount=0,c=1;
      while(c<=x)
      {
        if(x%c==0)
        {
          divcount++;
          System.out.println(c);
        }
          
            c++;
      }
      System.out.println("divisors"+divcount);
  }
}
