import java.util.Scanner;
public class Q9
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int[] x = new int[10];
    boolean found=false;
    for(int i=0;i<10;i++)
    {
     System.out.println("Enter a number");
     x[i]=sc.nextInt();
    }
    System.out.println("Check");
    int n=sc.nextInt();
    for(int i=0;i<10;i++)
    {
      if(x[i]==n)
      {
        found=true;
      }
    }
    if(found==true)
    {
      System.out.println("Yes");
    }
    else
      {
        System.out.println("No");
      }
  }
}