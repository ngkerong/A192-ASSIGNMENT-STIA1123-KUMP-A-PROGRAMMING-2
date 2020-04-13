/*Name:NG KE RONG*/
/*No.Matrik:271063*/

package testbook;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestBook {

    public static void main(String[] args) {
        
        /*Question 1*/
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("0.00");
        int n;
        
        System.out.print("Enter the number of books: ");
        n = sc.nextInt();
        
        Book[] myLibrary = new Book[n];
        
        /*Question2*/
        String title;
        double price;
        
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("\nEnter the title of book\t: ");
            title = sc.nextLine();
            System.out.print("Enter the price of book\t: ");
            price = sc.nextDouble();
            
            myLibrary [i] = new Book(title,price);
            
        }
        
        /*Question 3*/
        double highPrice = 0;
        String titleBook = "";
        
        for(int j =0; j < n; j++){
            
            if(myLibrary[j].getPrice() > highPrice){
                
                highPrice = myLibrary[j].getPrice();
                titleBook = myLibrary[j].getTitle();
            }
        }
        System.out.println("\n" + titleBook + " is thebook with the highest price which cost RM" + DF.format(highPrice));
        
        /*Question 4*/
        System.out.println("\nBooks that contain the term “Java” :");
        
        for(int k = 0; k < n; k++){
             
             if(myLibrary[k].getTitle().indexOf("Java") != -1){
                  System.out.println(myLibrary[k].getTitle());
             }
         }
        
        
        
    }
    
}
class Book {
    
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
 }
}