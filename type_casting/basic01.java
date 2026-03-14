/*
implicit casting - when a smaller data type is automatically converted to a larger data type.
explicit casting - when a larger data type is manually converted to a smaller data type, which may
*/


package type_casting;
public class basic01 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1; // Implicit casting (int to double)
        System.out.println("Integer value: " + num1);
        System.out.println("Double value after implicit casting: " + num2);

        double num3 = 5.5;
        int num4 = (int) num3; // Explicit casting (double to int)
        System.out.println("Double value: " + num3);
        System.out.println("Integer value after explicit casting: " + num4);
    }
}
