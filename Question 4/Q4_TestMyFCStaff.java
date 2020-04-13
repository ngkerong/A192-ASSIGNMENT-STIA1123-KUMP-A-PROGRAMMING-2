/*Name : NG KE RONG*/
/*No.Matrik : 271063*/

import java.util.*;
import java.text.DecimalFormat;

class Q4_TestMyFCStaff{

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
      System.out.print("Enter Total Sales\t\t\t: ");
      sales = sc.nextDouble();
      
      MyFCStaff info = new MyFCStaff (name, staffID, workHour, sales);
      
      System.out.println(info.toString());
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
    
    public String toString(){
    
      DecimalFormat DF = new DecimalFormat ("0.00");
    
      String name = ("\nStaff Name\t\t\t\t\t: " + staffName + "\n");
      String id = ("StaffID\t\t\t\t\t\t: " + staffID + "\n");
      String hour = ("Hours Work\t\t\t\t\t: " + DF.format(workHour) + "\n");
      String sale = ("Total Sale\t\t\t\t\t: RM" + DF.format(totalSale) + "\n");
      String salary = ("Total Salary\t\t\t\t: RM" + DF.format(calculateSalary()) + "\n");
      
      return name + id + hour + sale + salary;
      
    }
   
}
         
   
      