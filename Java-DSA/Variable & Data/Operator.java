import java.util.*;
public class Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = ++a;
        // pre increment
        System.out.println(a);
        System.out.println(b);
        
        // post increment

        int c = 10;
        int d = c++;
        System.out.println(d);
        System.out.println(c);
        sc.close();
        

    }
}
