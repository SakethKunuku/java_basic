package if_else;

public class positive_negative_or_zero {
    public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}
