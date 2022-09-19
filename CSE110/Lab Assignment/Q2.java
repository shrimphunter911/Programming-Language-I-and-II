public class Q2
{
  public static void main (String [] args)
  {
    int i=7,n=600,sum=0;
    while(i<=n)
    {
      if(i%7==0 && i%9==0)
      {
        sum=sum+i;
      }
      i++;
    }
    System.out.println("Sum="+sum);
  }
}
    