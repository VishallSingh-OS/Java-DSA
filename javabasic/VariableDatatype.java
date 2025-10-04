package javabasic;
public class VariableDatatype {
    
    public static void main (String[] args) {

        //❌ variable = a reusable container for a value
        //                 a variable behaves as if it was the value it contains in java
        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)
        
        /*
         *  Primitive   vs  Reference
         *   --------------------------
         *  int             string
         *  double          array
         *  char            object
         *  boolean
         
         */

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age1 = 21; // valid
        // int age2 = 21.5; // lossy conversion double to int

        int year = 2025;


        // System.out.println(age1);
        // System.out.println("The year is " + year);


        double price1 = 19.99;
        double price2 = 19; // output 19.0
        double gpa = 3.5;
        double temperature = -12.5;

        // System.out.println("$ " + price2);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        // System.out.println(currency);


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isOnline);

        if (isOnline) {
            System.out.println("You are online. ");
        }
        else {
            System.out.println("You are offline. ");
        }

        

        // string = sequence of character

        String name = "Vishal";
        System.out.println("Hello " + name);




    }
}
