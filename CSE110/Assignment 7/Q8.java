import java.util.Scanner;
public class Q8
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of input");
    int n=sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length-1;i++)
    {
      for(int j=0;j<a.length-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    int mean=0;
    if(n%2==0)
    {
      mean=((a[n/2])+(a[(n/2)-1]))/2;
    }
    else
    {
      mean=a[(n-1)/2];
    }
    System.out.println(mean);
  }
}
      