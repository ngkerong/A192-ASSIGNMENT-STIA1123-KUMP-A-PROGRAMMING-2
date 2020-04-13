import java.util.Scanner;

class TestStaff {
	  
      static Scanner console = new Scanner(System.in);	
      
      public static void main(String arg[]){
      
         String name, staffID;
         int WorkDay;
      
         /*Input name, staff id and working per day*/
         System.out.printf("Enter a staff's name\t\t\t:");
         name = console.nextLine();
         System.out.printf("Enter a staff's ID\t\t\t:");
         staffID = console.nextLine();
         System.out.printf("Enter the working per day\t:");
         WorkDay = console.nextInt();
         
         Staff info = new Staff();
         info.setStaffInfo(name, staffID, WorkDay);
         info.calculateSalary();
         
         /*Display output*/
         System.out.println("\nStaff's Name\t\t= "+info.getName());
         System.out.println("Staff's ID\t\t\t= " +info.getStaffID());
         System.out.println("Staff's Salary\t\t= RM " +info.getSalary());
         
      }
}

class Staff {
   	private String name, staffID;
   	private double salary;
   	private int workingDay;
   	public void setStaffInfo(String nm, String id, int wDay){
   		name = nm;
         staffID = id;
         workingDay = wDay;
	   }
   	public void calculateSalary(){
   		salary = workingDay * 35.0;
   	}
   	public double getSalary(){
   		return salary;
   	}
   	public String getName(){
   		return name;
   	}
   	public String getStaffID(){
   		return staffID;
   	}
}//end class