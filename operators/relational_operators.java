package operators;

public class relational_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);

        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);

        boolean isGreaterThan = (a > b);
        System.out.println("Is a greater than b? " + isGreaterThan);

        boolean isLessThan = (a < b);
        System.out.println("Is a less than b? " + isLessThan);

        boolean isGreaterThanOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual);
    }
    
}
