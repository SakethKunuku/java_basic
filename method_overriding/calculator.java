package method_overriding;
class Calc{
    public int add(int a,int b){
        return a + b;
    }
}
class AdvCalc extends Calc{
    // public int add(int a, int b){
    //     return a + b + 10;
    // }
}

public class calculator {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(2,3));
    }
}
