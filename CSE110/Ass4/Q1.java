import java.util.Scanner;
public class Q1
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    if(n<=100 && n>=0)
    {
      if(n<50)
      {
        System.out.println("F");
      }
      else if(n<60)
      {
        System.out.println("E");
      }
      else if(n<70)
      {
        System.out.println("D");
      }
      else if(n<80)
      {
        System.out.println("C");
      }
      else if(n<90)
      {
        System.out.println("B");
      }
      else if(n<=100)
      {
        System.out.println("A");
      }
    }
    if(n>100 || n<0)
    {
      System.out.println("Wrong Input");
    }
  }
}