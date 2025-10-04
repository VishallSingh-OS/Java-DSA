package javabasic;
import java.util.Scanner;

public class IfStatement {
    
    // if statement = executes a block of code if given condintion is true.

    public static void main(String[] args) {
        
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("You are a student (true/false): ");
        isStudent = scanner.nextBoolean();




        // GROUP 1

        if (name.isEmpty()) {
            System.out.println("You haven't enter your name. 😤");
        } else {
            System.out.println("Hello " + name + "! 😊");
        }


        // group 2

        if (age >= 65) {
            System.out.println("You are senior! 🧓🏻");
        } 
        else if (age >= 18 ) {
            System.out.println("You are adult 🧑🏻");
        }
        else if (age < 18) {
            System.out.println("You are child. 👶🏻");
        }
        else if (age == 0) {
            System.out.println("you are a baby. 🤱🏻");
        }
        else if (age < 0) {
            System.out.println("You are not born yet. 🍼");
        }
        else {
            System.out.println("Enter a valid age. NOT a string. ");
        }

        // Group 3

        if (isStudent) {
            System.out.println("You are student. 🧑🏻‍🎓");
        } else {
            System.out.println("You are NOT  a student. 👷🏻");
        }



        scanner.close();
        
    }
}
