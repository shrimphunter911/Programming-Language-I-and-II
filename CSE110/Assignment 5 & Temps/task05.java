import java.util.Scanner;
import java.lang.Math;
public class task05
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    double s=0;
    for(int i=1;i<=n;i++)
    {
      s=s+Math.pow(i,3);
    }
    double y=Math.cbrt(s);
    System.out.println("Y="+y);
  }
}