import java.util.Scanner;
public class Q6
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int a[]= new int[] {20,40,10,50,30};
    for(int i=0;i<a.length-1;i++)
    {
      for(int j=0;j<a.length-1-i;j++)
      {
        if(a[j]<a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println(a[n-1]);
  }
}