import java.util.Scanner;
public class Q10
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        c++;
      }
    }
    System.out.println(c);
  }
}