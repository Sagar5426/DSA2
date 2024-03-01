public class BitWiseOperators {
    public static void main(String[] args) {
        System.out.println("And Operator: " + (5&6));
        System.out.println("Or Operator: " + (5 | 6));
        System.out.println("XOR Operator: " + (5 ^ 6));
        System.out.println("1's Complement: " + (~9));

        // a<<b = a * 2^b (here ^ = raised to the power)
        System.out.println("Binary Left Shift: "+ (5<<2));

        // a>>b = a / 2^b (here ^ = raised to the power)
        System.out.println("Binary Right Shift: "+ (5>>2));

    }
}
