import java.util.Scanner;
public class Q1
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a mark");
    int n=sc.nextInt();
    int sum=n,max=n,min=n;
    for(int i=1;i<=9;i++)
    {
      System.out.println("Enter a mark");
      int x=sc.nextInt();
      if(x>max)
      {
        max=x;
      }
      if(x<min)
      {
        min=x;
      }
      sum=sum+x;
    }
    int avg=sum/10;
    System.out.println("Average="+avg);
    System.out.println("Max="+max);
    System.out.println("Min="+min);
  }
}