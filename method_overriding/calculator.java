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

/*
method overriding is like, assigining the highest priority to itself first, if not possible, use method in super class.
here in the example, when the AdvCalc has no add method present in it, it can calls the method add() in the super class Calc to get output of 5, 
but when the AdvCalc has the method add(), as a priority overriding, it calls the add() method in it's own class itself...!
 */