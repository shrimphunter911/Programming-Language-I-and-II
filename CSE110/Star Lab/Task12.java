import java.util.Scanner;
public class Task12
{
  public static void main (String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println ("Please enter a number");
    int n= sc.nextInt();
    
    for (int i=1; i<=n; i++)
    {
      for (int j=1; j<=n-i; j++)
      { 
        System.out.print(" "); 
      }
       for (int k=1; k<=((2*i)-1); k++)
       {
        System.out.print("*"); 
       }
  
    System.out.println(); 
    }
    
    int count=n-1;
    for(int i=1;i<=n-1;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(' ');
      }
      for(int j=1;j<=(count*2-1);j++)
      {
        System.out.print("*");
      }
      count--;
      System.out.println();
    }
     
}
}