import java.util.Scanner;
public class Task25
{
  public static void main(String []args)
  {
    Scanner key=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=key.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++)
      {
        System.out.print(k);
      }
      for(int m=i-1;m>0;m--)
      {
        System.out.print(m);
      }
      System.out.println();
    }
  }
}
      