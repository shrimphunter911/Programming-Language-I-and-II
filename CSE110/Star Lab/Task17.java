import java.util.Scanner;
public class Task17
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      if(i==1 || i==2 || i==n)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(j);
        }
      }
      else
      {
        for(int j=1;j<=i;j++)
        {
          if(j==1 || j==i)
          {
            System.out.print(j);
          }
          else
          {
            System.out.print(" ");
          }
        }
      }
      System.out.println("");
    }
  }
}
      
    