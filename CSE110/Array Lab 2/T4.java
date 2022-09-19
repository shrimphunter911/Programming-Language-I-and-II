import java.util.Scanner;
public class T4
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Enter a number");
      a[i]=sc.nextInt();
    }
    for(int k=0;k<a.length-1;k++)
    {
      for(int j=0;j<a.length-1-k;j++)
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}