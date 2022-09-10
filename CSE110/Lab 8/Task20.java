import java.util.Scanner;
public class Task20
{
  public static void main(String []args)
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter row");
    int r=key.nextInt();
    for(int i=1;i<r;i++)
    {
      for(int j=1;j<=(r-i);j++)
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
      System.out.println("");
    }
    for(int i=1;i<=2*r-1;i++)
    {
      System.out.print("*");
    }
  }
}
                       