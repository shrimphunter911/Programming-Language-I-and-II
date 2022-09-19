import java.util.Scanner;
public class Circle
{
  public static void main (String[] args)
  {
    Scanner keyboard;
    keyboard = new Scanner ( System.in);
    System.out.println("Please enter radius of a circle");
    double r;
    r = keyboard.nextDouble();
    double area = Math.PI*Math.pow(r,2);
    double circumference = 2*Math.PI*r;
    System.out.println("Area=" +area);
    System.out.println("circumference=" +circumference);
  }
}