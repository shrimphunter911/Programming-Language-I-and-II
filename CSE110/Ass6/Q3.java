import java.util.Scanner;
public class Q3
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int c=0;
    while(n>=1)
    {
      c++;
      n=n/10;
    }
    System.out.println(c);
  }
}
      