package constructor;
// same class name should not be there in the same package
// A constructor in Java is used to initialize an object when it is created.
class Humanb{
    private String name;
    private int age;

    public Humanb() {               // default constructor 
        name = "Saketh";
        age = 21;
    }

    public Humanb(int age) {               // parameterised constructors
        this.age = age;
    }

    public Humanb(String name) {
        this.name = name;
    }

    public Humanb(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

public class demo2 {
    public static void main(String[] args) {
        Humanb obj1 = new Humanb();
        Humanb obj2 = new Humanb("Saketh kunuku");
        Humanb obj3 = new Humanb(21);
        Humanb obj4 = new Humanb(21,"Kunuku Saketh");

        System.out.println(obj1.getName() + " " + obj1.getAge());
        System.out.println(obj2.getName() + " " + obj2.getAge());
        System.out.println(obj3.getName() + " " + obj3.getAge());
        System.out.println(obj4.getName() + " " + obj4.getAge());

    }
}

