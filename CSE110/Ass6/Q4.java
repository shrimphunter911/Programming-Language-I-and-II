import java.util.Scanner;
public class Q4
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int product=1;
    for(int i=1;i<=n;i++)
    {
      product=product*10;
    }
    System.out.println(product);
  }
}
      