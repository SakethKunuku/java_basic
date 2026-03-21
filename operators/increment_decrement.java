package operators;

public class increment_decrement {
    public static void main(String[] args) {
        int a = 10;

        // Incrementing a using post-increment
        System.out.println("Post-increment (a++): " + a++); // Outputs 10, then a becomes 11
        System.out.println("Current value of a: " + a); // Outputs 11

        // Incrementing a using pre-increment
        System.out.println("Pre-increment (++a): " + ++a); // a becomes 12, then outputs 12
        System.out.println("Current value of a: " + a); // Outputs 12

        // Decrementing a using post-decrement
        System.out.println("Post-decrement (a--): " + a--); // Outputs 12, then a becomes 11
        System.out.println("Current value of a: " + a); // Outputs 11

        // Decrementing a using pre-decrement
        System.out.println("Pre-decrement (--a): " + --a); // a becomes 10, then outputs 10
        System.out.println("Current value of a: " + a); // Outputs 10
    }
    
}
