package class_object;

class Calculator{
    int add(int a, int b){
        return a + b;
    }
    int subtract(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }
    int divide(int a, int b){
        if(b != 0){
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0; // or throw an exception
        }
    }
}

public class demo1 {
    public static void main(String[] args) {

        /*
        calc - is an object of the Calculator class. It is created using the new keyword, 
        which allocates memory for the object and returns a reference to it. 
        The calc object can then be used to call the methods defined in the Calculator class, 
        such as add, subtract, multiply, and divide.
         */

        Calculator calc = new Calculator(); // Create an instance of the Calculator class
        
        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        int quotient = calc.divide(10, 5);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}