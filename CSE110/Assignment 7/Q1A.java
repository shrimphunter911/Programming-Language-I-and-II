public class Q1A
{
  public static void main (String[] args)
  {
    int a[] = new int[] {10,30,20,50,40};
    int max=a[0],min=a[0],sum=a[0];
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
      if(a[i]<min)
      {
        min=a[i];
      }
      sum=sum+a[i];
    }
    int avg=sum/5;
    System.out.println("Max="+max);
    System.out.println("Min="+min);
    System.out.println("Avg="+avg);
  }
}