import java.util.Scanner;
public class Q15
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    for(int i=1;i<=20;i++)
    {
      System.out.println("Enter a number");
      int x=sc.nextInt();
      sum=sum+x;
      System.out.println(sum+",");
    }
  }
}