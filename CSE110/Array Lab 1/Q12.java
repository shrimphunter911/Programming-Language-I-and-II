import java.util.Scanner;
public class Q12
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int[] x = new int[10];
    for(int i=0;i<=9;i++)
    {
     System.out.println("Enter a number");
     int n=sc.nextInt();
     x[i]=n;
    }
    for(int i=9;i>=0;i--)
    {
      if(x[i]%2==0)
      {
        System.out.println(x[i]+" "+i);
      }
    }
  }
}