package Pattern;

public class zero_oneTriangle {
    public static void trianglePrint(int N){
        for (int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 == 0 ) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                    
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        trianglePrint(5);
    }
    
}
