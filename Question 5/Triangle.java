/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/


package triangledemo;

public class Triangle
{
     private double height;
     private double base;

     // The setHeight method accepts an argument which is    
     //stored in the height field.

     public void setHeight(double len)
     {
          height = len;
     }

     // The setBase method accepts an argument which is 
     //stored in the base field. 
    
     public void setBase(double b)
     {
          base = b;
     }

     //The set method accepts two arguments which are 
     //stored in the height and base fields.
  
     public void set(double len, double b)
     {
          height = len;
          base = b;
     }

    // The getHeight method returns the value stored in the 
    //  height field.

     public double getHeight()
     {
          return height;
     }

     // The getBase method returns the value stored in the   
     //base field

     public double getBase()
     {
          return base;
     }

     // The getArea method returns the value of area
    // with formula : 0.5 * height * base

     public double getArea()
     {
          return 0.5 * height * base;
     }
}