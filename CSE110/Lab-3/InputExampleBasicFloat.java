// Scanner is only required for taking input
// do not write scanner in a program where 
// there is no input
import java.util.Scanner;
public class InputExampleBasicFloat
{  
    public static void main (String[] args)
    {   
        // you can use any other meaningful 
        // variable name instead of "keyboard"
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        // "System.in" is default input device for 
        // our computer system
        
        System.out.println("Please enter an number"); //prompt
        float x; 
        x = keyboard.nextFloat();    // flowchart equivalent is READ x 
        System.out.println("Please enter another number");
        float y;
        y = keyboard.nextFloat();
        float Sum;
        Sum=x+y;
        float Product;
        Product=x*y;
        float Difference;
        Difference=x-y;
        System.out.println(Sum);
        System.out.println(Product);
        System.out.println(Difference);
    }
}