/*Name : NG KE RONG*/
/*No.Matrik : 271063*/

import java.util.*;
import java.text.DecimalFormat;

class TestMyFCStaff{

   static Scanner sc = new Scanner (System.in);
   
   public static void main (String[] args){
      
      String name, staffID;
      double workHour, sales;
      
      /*Input name, staff id and working per day*/
      System.out.printf("Enter a staff's name\t\t: ");
      name = sc.nextLine();
      System.out.printf("Enter a staff's ID\t\t: ");
      staffID = sc.nextLine(); 
      System.out.printf("Enter total hours work\t: ");
      workHour = sc.nextDouble();
      System.out.print("Enter Total Sales\t\t\t: RM ");
      sales = sc.nextDouble();
      
      MyFCStaff info = new MyFCStaff (name, staffID, workHour, sales);
      
      info.displaySalary();
   }
   
}

class MyFCStaff{
   
   String staffName, staffID;
   double workHour, totalSale,  totalCommission, totalSalary;
   
   MyFCStaff(String staffName, String staffID, double workHour, double totalSale){
   
      this.staffName = staffName;
      this.staffID = staffID;
      this.workHour = workHour;
      this.totalSale = totalSale;
      
   }
   
   double calculateCommission(){
   
      if ( totalSale >= 150 & totalSale <= 300){
         totalCommission = totalSale * 0.05;
      }else if ( totalSale >= 301 & totalSale <= 500){
               totalCommission = totalSale * 0.10;
            }else if ( totalSale >= 501 ){
                     totalCommission = totalSale * 0.15;
                  }else{
                     totalCommission = 0;
      
      }
      
      return totalCommission;
    }
    
    double calculateSalary(){
      
      totalSalary = ( workHour * 8 ) + calculateCommission();
      
      return totalSalary;
    }
    
    public void displaySalary(){
    
      DecimalFormat DF = new DecimalFormat ("0.00");
      DecimalFormat df = new DecimalFormat ("0");
    
      System.out.println("\nStaff Name\t\t\t\t\t: " + staffName);
      System.out.println("StaffID\t\t\t\t\t\t: " + staffID);
      System.out.println("Hours Work\t\t\t\t\t: " + df.format(workHour));
      System.out.println("Total Sale\t\t\t\t\t: RM " + DF.format(totalSale));
      System.out.println("Total Salary\t\t\t\t: RM " + DF.format(calculateSalary()));
      
    }
   
}
         
   
      