package terenary_operators;

public class positive_negative {
    public static void main(String[] args) {
        int number = -5;

        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(number + " is " + result + ".");
    }
    
}
