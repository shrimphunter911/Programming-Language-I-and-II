public class Q2
{
  public static void main(String []args)
  {
    int x=0;
    int y=1;
    System.out.println(x+",");
    System.out.println(y+",");
    while(x+y<=1600)
    {
      int sum=x+y;
      System.out.println(sum+",");
      x=y;
      y=sum;
    }
  }
}
    