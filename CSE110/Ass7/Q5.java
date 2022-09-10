public class Q5
{
  public static void main(String [] args)
  {
    int a[] = new int [] {50,30,20,10,40};
    int largest=a[1];
    int x=0;
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>largest)
      {
        largest=a[i];
        x=i;
      }
    }
      int temp=a[1];
      a[1]=a[x];
      a[x]=temp;
    System.out.println(a[1]);
  }
}