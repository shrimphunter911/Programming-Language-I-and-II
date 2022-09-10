import java.util.Scanner;
public class Q15
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Starting Range");
    int m=sc.nextInt();
    System.out.println("Enter Ending Range");
    int n=sc.nextInt();
    int prc=0,pec=0;
    while(m<=n)
    {
      int divc=0,sum=0;
      for(int i=1;i<m;i++)
      {
        if(m%i==0)
        {
          divc++;
          sum=sum+i;
        }
      }
      if(sum==m)
      {
        pec++;
      }
      if(divc==1)
      {
        prc++;
      }
      m++;
    }
    System.out.println("Perfect="+pec);
    System.out.println("Prime="+prc);
  }
}