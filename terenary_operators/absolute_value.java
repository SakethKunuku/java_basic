package terenary_operators;

public class absolute_value {
    public static void main(String[] args) {
        int number = -10;

        int absValue = (number < 0) ? -number : number;
        System.out.println("The absolute value of " + number + " is: " + absValue);
    }
    
}
