/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

package payrolldemo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PayrollDemo {

    public static void main(String[] args) {
        
        Employee in =new Employee();
        in.input();
        Payroll total = new Payroll(in.grossPay, in.stateTax, in.federalTax);
        total.printOutput();
        
    }
    
}

class Employee {
    
    int employeeID;
    double grossPay, stateTax, federalTax;
    Scanner sc = new Scanner(System.in);
    
    void input(){
        
        System.out.print("Enter your employee ID number\t: ");
        employeeID = sc.nextInt();
        System.out.print("Enter your Gross Pay\t\t: RM ");
        grossPay = sc.nextDouble();
        System.out.print("Enter your State Tax\t\t: RM ");
        stateTax = sc.nextDouble();
        System.out.print("Enter your Federal Tax\t\t: RM ");
        federalTax = sc.nextDouble();
        
    }
}

class Payroll{
    
    DecimalFormat DF = new DecimalFormat ("0.00");
    public double grossPay, stateTax, federalTax, netPay;
    
    public Payroll(double grossPay, double stateTax, double federalTax){
        
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay(){
        
        return netPay = grossPay - stateTax - federalTax; 
    }

    public void printOutput(){
         
        System.out.println("\nNet pay is : RM " + DF.format(calculateNetPay()));
    }

}
