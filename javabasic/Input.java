package javabasic;
import java.util.Scanner;



/*
 * The Scanner class is part of the java.util package and is primarily used to read input from various sources, such as the keyboard (standard input), files, or strings. It provides a convenient way to parse primitive data types (like int, double, boolean) and strings from the input source.
 * 
 * Key Features -- > 
 
 * 1.  Reading user input:   The most common use case is to read input provided by the user during program execution, typically from the console (System.in).
 
 
 */

public class Input {
    
    
    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();


        /*
         * the nextInt() method only reads the integer value but it does not consume the newline character (\n) that you press after entering the number.
            So after you type 25 and press Enter, the input actually looks like this: 25\n
            25 → read by nextInt()
            \n (newline/Enter key) → left in the input buffer
         */

    System.out.print("Enter your age: ");
    int age = scanner.nextInt(); // 25\n

    scanner.nextLine();




    System.out.print("Enter your favorite color: ");
    String color = scanner.nextLine();


    System.out.print("Enter your gpa: ");
    double gpa = scanner.nextDouble();

    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.println("Hello " + name + "! you are " + age + " years old. and your gpa is " +  gpa);

    if (isStudent) {
        System.out.println("You are enrolled as student.");
    } else {
        System.out.println("You are not a student.");
    }

    System.out.println("You like " + color);








    scanner.close();


}
}
