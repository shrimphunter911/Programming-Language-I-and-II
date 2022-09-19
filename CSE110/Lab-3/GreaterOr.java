import java.util.Scanner;
public class GreaterOr
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
      System.out.println("first is greater");
    }
    else {
      System.out.println("first is not greater");
    }
  }
}