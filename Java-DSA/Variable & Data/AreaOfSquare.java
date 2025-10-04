import java.util.*;
public class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        double area = side*side;
        System.out.println("Area of Square: " + area);
        
        sc.close();

    }
}
