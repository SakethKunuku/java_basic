package operators;

public class assignment_operators {
    public static void main(String[] args) {
        int a = 10;

        // Using assignment operator
        a = 20;
        System.out.println("Assignment (a = 20): " + a);

        // Using addition assignment operator
        a += 5; // Equivalent to a = a + 5
        System.out.println("Addition Assignment (a += 5): " + a);

        // Using subtraction assignment operator
        a -= 3; // Equivalent to a = a - 3
        System.out.println("Subtraction Assignment (a -= 3): " + a);

        // Using multiplication assignment operator
        a *= 2; // Equivalent to a = a * 2
        System.out.println("Multiplication Assignment (a *= 2): " + a);

        // Using division assignment operator
        a /= 4; // Equivalent to a = a / 4
        System.out.println("Division Assignment (a /= 4): " + a);

        // Using modulus assignment operator
        a %= 3; // Equivalent to a = a % 3
        System.out.println("Modulus Assignment (a %= 3): " + a);
    }
    
}
