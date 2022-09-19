import java.util.Scanner;
public class GreaterSubstract
{
  public static void main (String[] args)
  {
    Scanner keyboard;
    keyboard = new Scanner ( System.in);
    System.out.println("Please enter a number");
    int x;
    x = keyboard.nextInt();
    System.out.println("Please enter another number");
    int y;
    y = keyboard.nextInt();
    if (x > y){
      int r=x-y;
      System.out.println("Result=" +r);
    }
    else if (x < y){
      int r=y-x;
      System.out.println("Result=" +r);
    }
    
  }
}