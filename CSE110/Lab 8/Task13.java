import java.util.Scanner;
public class Task13
{
  public static void main (String []args)
  {
    Scanner key=new Scanner(System.in);
    System.out.println ("Please enter a number");
    int n=key.nextInt();
    
    for (int i=1; i<=n; i++)
    {
      for (int j=1; j<=n-i; j++)
      { 
        System.out.print(" "); 
      }
       for (int k=1; k<=((2*i)-1); k++)
       {
        System.out.print(k); 
       }
  
    System.out.println(); 
    }
    
    int line=n-1;
    int count=line;
    for(int i=1;i<=line;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(' ');
      }
      for(int j=1;j<=(count*2-1);j++)
      {
        System.out.print(j);
      }
      count--;
      System.out.println();
    }
     
}
}