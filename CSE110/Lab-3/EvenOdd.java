import java.util.Scanner;
public class EvenOdd
{
  public static void main (String[] args)
  {
    Scanner keyboard;
    keyboard = new Scanner ( System.in);
    System.out.println("Please enter a number");
    int x;
    x = keyboard.nextInt();
    if (x%2==0){
    System.out.println("The number is even");
    }
    else {
    System.out.println("The number is odd");
    }
  }
}