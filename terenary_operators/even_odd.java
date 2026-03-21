package terenary_operators;

public class even_odd {
    public static void main(String[] args) {
        int number = 7;

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }
    
}
