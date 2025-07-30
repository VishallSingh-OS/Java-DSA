package Pattern;

// GitHub - Vishal- Singh OS
public class PatternRevision {
    

    // 1. function for hollow square pattern 
    public static void squareHollow(int n) {

        //outer loop 0 to n
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) { // inner loop 0 to n

                // condition for print to *
                if (i==0 || i==n-1 || j == 0 || j==n-1) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    // 2. function for number triangle pattern
    public static void numberTriangle(int n) {
        int i, j;

        // outer loop 
        for (i = 1; i <= n; i++) {
            
            // inner loop to print space
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print star
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            
            // print new line for each row
            System.out.println();
        }
    }





    // 3. function to print number increasing pyramid pattern
    public static void numberPyramid(int n) {
        
        // outer loop to print each line
        for (int i = 0; i < n; i++) {

            // inner loop to print each element(number)
            for (int j = 1; j <= i; j++) {
                System.err.print(j + " ");
            }
            System.out.println();

        }
    }





    // 4. Number-Increasing Reverse Pyramid Pattern
    public static void numberIncreasingReversePyramid(int n) {

        // outer loop to print each line 
        for (int i = 0; i < n; i++) {

            // inner loop to print number 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.err.println();
        }
    }





    // 5. Number-Changing Pyramid Pattern
    public static void numberChangingPyramid(int n) {

        int num = 1; // for printing num

        // outer  loop for each line
        for (int i = 0; i < n; i++) {

            // inner loop 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++; // increasing num each time
            }
            System.out.println();
        }
    }






    // 6. Zero one Triangle Pattern
    public static void zoroOneTriangle(int n) {
        // outer loop 1 to n
        for (int i = 1; i <= n; i++) {

            // inner loop every element
            for (int j = 1; j <= i; j++) {
                
                // if (i+j) is even print 1
                if ((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " "); // otherwise print 0
                }
            }
            System.out.println();
        }
    }





    //7. Palindrome Triangle Pattern
   // 7. Palindrome Triangle Pattern
public static void palindromeTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        
        // Print spaces to center the triangle
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }

        // Print decreasing numbers (left side of the triangle)
        for (int j = i; j >= 1; j--) {
            System.out.print( j + " " );
        }

        // Print increasing numbers (right side of the triangle)
        for (int j = 2; j <= i; j++) {
            System.out.print( j + " ");
        }

        // Move to the next line
        System.out.println();
    }
}





    
    // Driver function
    public static void main(String[] args) {

        // squareHollow(6);
        // numberTriangle(6);
        // numberPyramid(6);
        // numberIncreasingReversePyramid(6);
        // numberChangingPyramid(6);
        // zoroOneTriangle(6);
        palindromeTriangle(6);

    }
}
