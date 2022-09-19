import java.util.Scanner;
public class T2
{
  public static void main (String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Enter a number");
      a[i]=sc.nextInt();
    }
    int max=a[0];
    int x=0;
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        x=i;
      }
    }
    System.out.println(max+","+x);
  }
}