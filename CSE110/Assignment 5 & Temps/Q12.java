import java.util.Scanner;
public class Q12
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    double sum=0,count=0,avg=0;
    for(int i=1;i<=10;i++)
    {
      System.out.println("Enter a number");
      int x=sc.nextInt();
      if(x%4==0)
      {
        sum=sum+x;
        count++;
      }
    }
    avg=sum/count;
    System.out.println("Total="+sum);
    System.out.println("Average="+avg);
  }
}
    
        
    