import java.util.Scanner;
public class Task18
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter row");
    int r=key.nextInt();
    for(int i=1;i<r;i++)
    {
      for(int j=r-1;j>=i;j--)
      {
        System.out.print(" ");
      }
      int count=0;
      for(int k=1;k<=r;k++)
      {
        if(k>r-i)
        {
           count++;
           if(count==1 || count==i)
        {
           System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
        }
      }
      System.out.println("");
    }
    for(int i=1;i<=r;i++)
    {
      System.out.print("*");
    }
  }
}
                       