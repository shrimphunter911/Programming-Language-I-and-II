import java.util.Scanner;
public class Task14
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row");
    int r=sc.nextInt();
    System.out.println("Enter col");
    int c=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
      if(i==1 || i==r)
      {
      for(int j=1;j<=c;j++)
      {
        System.out.print("*");
      }
      }
      else
      {
      for(int j=1;j<=c;j++)
      {
        if(j==1 || j==c)
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
  }
}
                       