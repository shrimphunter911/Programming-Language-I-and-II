import java.util.Scanner;
public class Task18
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
      for(int k=1;k<=r;k++)
      {
        int c=0;
        if(k>r-i)
        {
          c++;
        }
        if(c==1 || c==r)
        {
        System.out.print(k);
        }
        else
        {
        System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}