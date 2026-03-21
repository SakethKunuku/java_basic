package operators;

public class logivcal_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b;
        System.out.println("Logical AND (a && b): " + andResult);

        boolean orResult = a || b;
        System.out.println("Logical OR (a || b): " + orResult);

        boolean notA = !a;
        System.out.println("Logical NOT (!a): " + notA);

        boolean notB = !b;
        System.out.println("Logical NOT (!b): " + notB);
    }
    
}
