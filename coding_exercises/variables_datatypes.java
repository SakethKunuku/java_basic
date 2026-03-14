
/*
 * Exercise: Variables and Data Types
 * Create a Java program that declares variables of different data types (int, double, String) and prints their values.
 * Use the following values:
 * - int age = 25;
 * - double height = 5.9;
 * - String name = "Alex";
 * The output should be formatted as follows:
 * Name: Alex, Age: 25, Height: 5.9
 */

package coding_exercises;
public class variables_datatypes {
    public static void main(String[] args) {
        int age = 25;
        double height = 5.9;
        String name = "Alex";
        System.out.printf("Name: %s, Age: %d, Height: %.1f", name, age, height);
    }
}