import java.util.Scanner;
public class Task6
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter row");
    int r=key.nextInt();
    for(int i=1;i<=r;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println("");
    }
  }
}
                       