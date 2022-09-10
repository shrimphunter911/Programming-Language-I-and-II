public class Q3
{
  public static void main(String [] args)
  {
    int a[] = new int [] {10, 30, 20, 50, 40};
    int largest=a[0];
    int x=0;
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>largest)
      {
        largest=a[i];
        x=i;
      }
    }
    System.out.println("Largest number is="+largest);
    System.out.println("Largest number was found at location="+x);
  }
}