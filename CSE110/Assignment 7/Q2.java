public class Q2
{
  public static void main (String[] args)
  {
    int a[] = new int[] {10,30,20,50,40};
    int sum=a[0];
    for(int i=1;i<a.length;i++)
    {
      sum=sum+a[i];
    }
    int avg=sum/5,count=0;
    System.out.println("Avg="+avg);
    for(int j=0;j<a.length;j++)
    {
      if(a[j]>avg)
      {
        System.out.println(a[j]);
        count++;
      }
    }
    System.out.println(count);
  }
}