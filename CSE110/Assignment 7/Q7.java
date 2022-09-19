public class Q7
{
  public static void main(String [] args)
  {
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
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}