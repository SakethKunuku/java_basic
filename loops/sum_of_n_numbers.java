package loops;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        int n = 5; 
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
    
}
