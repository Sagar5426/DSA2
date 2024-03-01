public class Hollow_ButterFly {
    public static void main(String[] args) {
        int n = 5;

        //Upper side of pattern
        for (int i = 1; i <= n; i++) {
            // hollow stars 1st part
            for (int j = 1; j <=i ; j++) {
                if (i==1|| j==1 ||j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            for (int j = 1; j<=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            // hollow star 2nd part
            for (int j = 1; j <= i ; j++) {
                if (i==1 || j==1 || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Downside of pattern
        for (int i = n; i >= 1; i--) {
            // hollow stars 1st part
            for (int j = 1; j <=i ; j++) {
                if (i==1|| j==1 ||j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            for (int j = 1; j<=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            // hollow star 2nd part
            for (int j = 1; j <= i ; j++) {
                if (i==1 || j==1 || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
