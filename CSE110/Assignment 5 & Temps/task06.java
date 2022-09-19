import java.util.Scanner;
import java.lang.Math;
public class task06
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    double s=0;
    for(int i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        s=s-Math.pow(i,2);
      }
      else
      {
        s=s+Math.pow(i,2);
      }
    }
    System.out.println("Y="+s);
  }
}