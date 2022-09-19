import java.util.Scanner;
public class Q5
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    while(n>1)
    {
      int r=n%10;
      System.out.print(r+",");
      n=n/10;
    }
  }
}
      