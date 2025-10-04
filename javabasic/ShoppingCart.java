package javabasic;
import java.util.Scanner;

public class ShoppingCart {
      
    // SHOPPING CART PROGRAM

    public static void main(String[] args) {
        
        String item;
        double price;
        char currency = '$';
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("What would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("How many would you like: ");
        quantity = scanner.nextInt();

        System.out.print("What is the price for each: (in dollor)");
        price = scanner.nextDouble();

        total = price * quantity;


        System.out.println("You have bought " + quantity + item + "/s");
        System.out.println("Total price is "  + currency + total);

    }
}
