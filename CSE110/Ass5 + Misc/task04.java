import java.util.Scanner;
public class task04
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int x=sc.nextInt();
    int min=x,c=0,sum=0;
    if(x%2==0)
    {
      sum=x;
      c++;
    }
    for(int i=1;i<=19;i++)
    {
      System.out.println("Enter a number");
      int n=sc.nextInt();
      if(n<min)
      {
        min=n;
      }
      if(n%2==0)
      {
        sum=sum+n;
        c++;
      }
    }
    int avg=sum/c;
    System.out.println("Minimum="+min);
    System.out.println("Average Of The Odd="+avg);
  }
}
      