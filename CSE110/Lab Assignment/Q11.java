public class Q11
{
  public static void main(String []args)
  {
    for(int i=40;i<=50;i++)
    {
      int c=1,divcount=0;
      while(c<=i)
      {
      if (i%c==0)
      {
        divcount++;
      }
      c++;
    }
      if(divcount<=2)
    {
      System.out.println(i);
    }
    }
  }
}