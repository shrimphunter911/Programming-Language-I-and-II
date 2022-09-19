import java.util.Scanner;
public class Task8
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row");
    int r=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
      for(int j=r-1;j>=i;j--)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++)
      {
        System.out.print(k);
      }
      System.out.println("");
    }
  }
}
                       