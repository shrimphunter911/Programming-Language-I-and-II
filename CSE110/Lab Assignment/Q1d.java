public class Q1d
{
  public static void main (String [] args)
  {
    int i=18,n=63;
    while(i<=n)
    {
      if(i%2==0)
      {
      if(i<n)
      {
      System.out.println(i+",");
      }
      else
      {
      System.out.println(i);
      }
      }
      else
      {
      if(i<n)
      {
      System.out.println("-"+i+",");
      }
      else
      {
      System.out.println("-"+i);
      }
      }
      i=i+9;
    }
  }
}