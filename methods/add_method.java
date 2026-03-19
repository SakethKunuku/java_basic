package methods;
class AdditionSample {
    public int add(int a, int b) {
        return a + b;
    }
}
public class add_method {
    public static void main(String[] args) {
        AdditionSample as = new AdditionSample();
        int num = 10;
        int result = as.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}