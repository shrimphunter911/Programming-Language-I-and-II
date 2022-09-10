import java.util.Scanner;
public class Q13
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int sume=0,sumo=0,sum5=0;
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
        sume=sume+x[i];
      }
      if(x[i]%2!=0)
      {
        sumo=sumo+x[i];
      }
      if(x[i]%5==0)
      {
        sum5=sum5+x[i];
      }
    }
    System.out.println("Sum of evens="+sume);
    System.out.println("Sum of odds="+sumo);
    System.out.println("Sum of divisibles by 5= "+sum5);
  }
}