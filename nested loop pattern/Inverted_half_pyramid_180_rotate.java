public class Inverted_half_pyramid_180_rotate {
         public static void main(String[] args) {
                  
         int n = 4;
         //outer loop
         for (int i=n; i>=1; i--) {
                  //inner loop-> space print
                  for (int j=1; j<=n-i; j++) {
                           System.out.print(" ");
                  }
                  //inner loop-> star print
                  for (int j=1; j<=i; j++) {
                           System.out.print("*");
                  }
                  System.out.println();
         }

         
}
}