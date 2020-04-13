/*Name:NG KE RONG*/
/*No.Matrik:271063*/

package teststudent;

import java.util.Scanner;

public class TestStudent {  
    
    public static void main (String [] args) {
	
        Scanner input = new Scanner(System.in);
        String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
	//complete your code here
        
        /*Input Matric No, Test 1 and Test 2*/
        for(int i = 0; i < studDegree.length; i++){
            
            System.out.print("Matric No : ");
            matricNo = input.next();
            System.out.print("Test 1 : ");
            test1 = input.nextDouble();
            System.out.print("Test 2 : ");
            test2 = input.nextDouble();
            
            studDegree [i] = new Student (matricNo, test1, test2);
            studDegree[i].calculateAverage();
        }
        
        /*Output*/
        System.out.println("\t*****************************");
        System.out.printf("\t%24s\n", "STUDENT INFORMATION");
        System.out.println("\t*****************************\n");
        System.out.println("\tMatric No\tAverageMark");
        
        for(int j = 0; j < studDegree.length; j++){
        
            System.out.println(studDegree[j].getStudentInfo());
        }
        

  }//end of main method
}//end of class TestStudent

