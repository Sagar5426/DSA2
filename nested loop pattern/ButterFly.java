public class ButterFly {
    public static void main(String[] args) {

        int n = 4;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop for half-pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            //inner loop for rotated half pyramid 180
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // just flip the i value from n to 1
        // outer loop for the other inverted part
        for (int i = n; i >= 1 ; i--) {
            //inner loop for half-pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            //inner loop for rotated half pyramid 180
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
