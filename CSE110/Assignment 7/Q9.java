import java.util.Scanner;
public class Q9 
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter quantity");
    int q = sc.nextInt();
    int s = 0;
    int marks[] = new int [q];
    String name[] = new String [q];
    int id [] = new int [q];
    for(int i=0;i<q;i++)
    {
      System.out.println("Enter a name");
      name[i]=sc.next();
      System.out.println("Enter an id");
      id[i]=sc.nextInt();
      System.out.println("Enter mark");
      marks[i]=sc.nextInt();
      s=s+marks[i];
    }
    int avg=s/q;
    for(int i=0;i<q;i++)
    {
      System.out.println("Average="+avg);
      System.out.println("Name="+name[i]);
      System.out.println("ID="+id[i]);
    }
  }
}
      
      