package Pattern;

public class HollowRhombus {
    public static void hollowRhombus(int n){
        // outer loop
        for (int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }

            // stars 
            for (int j=1; j<=n; j++){
                if (j == 1 || i == 1 || j== n || i== n){
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
