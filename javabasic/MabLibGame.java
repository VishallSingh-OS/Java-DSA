package javabasic;
import java.util.Scanner;

public class MabLibGame {
    
    public static void main(String[] args) {
     
        String noun1;
        String adjective1;
        String verb;
        String noun2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an animal or person name: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description) for the above name : ");
        adjective1 = scanner.nextLine();
        
        System.out.print("Enter a verb in 3rd form or ing form: ");
        verb = scanner.nextLine();

        System.out.print("Enter another animal or person name: ");
        noun2 = scanner.nextLine();

        System.out.println("Yesterday, I saw a " + noun1 +
                        " It was very " + adjective1 + " so I " + verb + " it. Then a " + noun2 + " appeared and everything became funny!");




    }
}
