import java.util.Scanner;
public class Task22
{
  public static void main (String []args)
  {
    Scanner key= new Scanner(System.in);
    System.out.println ("Please enter a number");
    int n= key.nextInt();
    
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      int c=0;
      for(int k=1;k<=(2*i-1);k++)
      {
        c++;
        if(c==1 || c==(2*i-1))
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    int r=n-1;
    for(int i=1;i<=n-1;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
      int ec=0;
      for(int k=1;k<=(r*2-1);k++)
      {
        ec++;
        if(ec==1 || ec==(r*2-1))
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      r--;
      System.out.println();
    }
  }
}