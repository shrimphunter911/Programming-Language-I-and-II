import java.util.Scanner;
public class Greater
{
  public static void main (String[] args)
  {
    Scanner keyboard;
    keyboard = new Scanner ( System.in);
    System.out.println("Please enter a number");
    double x;
    x = keyboard.nextDouble();
    System.out.println("Please enter another number");
    double y;
    y = keyboard.nextDouble();
    if (x > y){
      System.out.println("first");
    }
  }
}