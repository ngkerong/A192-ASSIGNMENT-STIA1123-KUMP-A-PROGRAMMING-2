/*Name: NG KE RONG*/
/*No.Matrik: 271063*/

package triangledemo;

import java.util.Scanner;

public class TriangleDemo {

    public static void main(String[] args) {
 
      //create a Scanner object
      Scanner sc = new Scanner (System.in);

      // Create a Triangle object.
      Triangle tri = new Triangle();

      // Prompt user to input value for height and base                 
      System.out.print("Enter a height \t: ");
      double height = sc.nextDouble();
      System.out.print("Enter a base \t: ");
      double base = sc.nextDouble();
      
      //Set the height and base (use mutator) 
      tri.setHeight(height);
      tri.setBase(base);
      
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is " + tri.getHeight());
      System.out.println("The pyramid's base is " + tri.getBase());
      System.out.println("The pyramid's area is " + tri.getArea());
      
   }
    
}


