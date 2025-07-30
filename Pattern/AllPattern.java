package Pattern;

public class AllPattern {
    
    public static void HollowPattern(int totRows, int totCols){
        // outer loops
        for ( int i=1; i<=totRows; i++){
            // inner loops
            for(int j=1; j<=totCols; j++){
                
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    public static void invertedRotatedHalfPyramic(int n){
        for(int i=1; i<=n; i++){

            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // HollowPattern(4,5); 
        invertedRotatedHalfPyramic(4);   
    }
}
