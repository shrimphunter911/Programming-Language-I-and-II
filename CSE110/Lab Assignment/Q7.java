import java.util.Scanner;
public class Q7
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=key.nextInt();
    int max=n,min=n,sum=n,c=1;
    System.out.println("Enter a quanity");
    int q=key.nextInt();
    while(c<=q-1)
    {
      System.out.println("Enter another number");
      int n1=key.nextInt();
      if (n1>max)
      {
        max=n1;
      }
      else if (n1<min)
      {
        min=n1;
      }
      sum=sum+n1;
      c++;
    }
    int avg=sum/q;
    System.out.println("Maximum="+max);
    System.out.println("Minimum="+min);
    System.out.println("Average="+avg);
  }
}