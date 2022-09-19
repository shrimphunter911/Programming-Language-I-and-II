import java.util.Scanner;
public class Q10 
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter quantity");
    int q = sc.nextInt();
    int x=0;
    int a[] = new int [q];
    System.out.println("Enter first number into array");
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++)
    {
      System.out.println("Enter numbers into array");
      a[i]= sc.nextInt();
      for(int j=0;j<i;j++)
      {
        if(a[j]>=a[i])
        {
          x=1;
          break;
        }
      }
    }
    if(x==1)
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
}
    

               