import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main
{
  public static void main (String []args)
  {
   for (int c=1;c<=200;c++)
   {
     Scanner sc = new Scanner(in);
     out.println("number");
                 int x=sc.nextInt();
                 if (x%2==0)
                   out.println("even");
                 else
                   out.println("odd");
                 }
  }
}