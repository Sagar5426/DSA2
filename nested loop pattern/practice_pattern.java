public class practice_pattern {
    public static void hollowRectangle(int rows,int columns){
        //outer loop
        for (int i = 1; i <= rows ; i++) {
            // for boundary stars
            for (int j = 1; j <= columns ; j++) {
                if (i==1 || j==1 || i==rows || j==columns){
                    System.out.print("*");
                }
                // spaces
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = 1; j <= (n-i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidNumber(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void characterHalfPyramid(int n){
        char ch = 'A';
        //outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= (n-i+1) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPyramid(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void floydsTriangle(int n){
        int num = 1;
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void zeroAndOneTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = 1; j <= i ; j++) {
                if ((i+j)%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
                System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        // outer loop for 1st half
        for (int i = 1; i <= n ; i++) {
            //inner loop- half pyramid
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            for (int j = 1; j <= (n-i)*2 ; j++) {
                System.out.print(" ");
            }
            // inner loop- inverted half pyramid
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // outer loop for 2nd half
        for (int i = n; i >= 1 ; i--) {
            //inner loop- half pyramid
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            for (int j = 1; j <= (n-i)*2 ; j++) {
                System.out.print(" ");
            }
            // inner loop- inverted half pyramid
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                if (i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        // outer loop for 1st half
        for (int i = 1; i <= n ; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            // inner loop stars- 1st part
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            // inner loop stars- 2nd part
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // outer loop for 2nd half
        for (int i = n; i >= 1 ; i--) {
            // inner loop for spaces
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            // inner loop stars- 1st part
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            // inner loop stars- 2nd part
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramidTriangle(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop- spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //inner loop-numbers
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void palindromicNumberPyramid(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop - spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            // inner loop - numbers 1st half
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            // inner loop - numbers 2nd half
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
//        hollowRectangle(4,5);
//        invertedHalfPyramid(4);
//        halfPyramidNumber(4);
//        characterHalfPyramid(4);
//        invertedHalfPyramidWithNumbers(5);
//        invertedAndRotatedHalfPyramid(4);
//        floydsTriangle(5);
//        zeroAndOneTriangle(5);
//        butterflyPattern(4);
//        solidRhombus(5);
//        hollowRhombus(5);
//        diamond(4);
//        numberPyramidTriangle(5);
        palindromicNumberPyramid(5);
    }
}
