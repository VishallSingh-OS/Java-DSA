package Pattern;

public class InvertedRotatedPyramid {

    public static void invertedRotatedPyramid(int n){
        
        // outer loop
        for (int i=0; i<n; i++){
            
            // spaces 
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            // stars
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedRotatedPyramid(4);
    }
    
}
