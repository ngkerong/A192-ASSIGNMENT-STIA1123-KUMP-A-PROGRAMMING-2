/*Name:Ng Ke Rong*/
/*no.Matrik:271063*/

package average;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat ("0.00");
        
        int no1, no2, no3, no4;
        
        /*Input 3 interger numbers*/
        System.out.print("Enter first number\t: ");
        no1 = sc.nextInt();
        System.out.print("Enter second number\t: ");
        no2 = sc.nextInt();
        System.out.print("Enter third number\t: ");
        no3 = sc.nextInt();
        
        /*Output Average of 3 numbers*/
        System.out.println("Average of 3 numbers\t: " + DF.format(Average(no1, no2, no3)));
        
        /*Input another number*/
        System.out.print("Enter another number\t: ");
        no4 = sc.nextInt();
        
        /*Output Average of 4 numbers*/
        System.out.println("Average of 4 numbers\t: " + DF.format(Average(no1, no2, no3,no4)));
        
        
        
    }
    
    public static double Average(int no1, int no2, int no3){
        
        return (double)(no1+no2+no3)/3;
    }
    
    public static double Average(int no1, int no2, int no3, int no4){
        
        return (double)(no1+no2+no3+no4)/4;
    }
}

