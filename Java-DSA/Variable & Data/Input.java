import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); // take only starting word until a space come
        // System.out.println(input);

        String name = sc.nextLine(); // take word after space
        System.out.println(name);

        int var = sc.nextInt(); // for int nextInt
        System.out.println(var);
        sc.close();
    }
}
