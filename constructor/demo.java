package constructor;
class Human{
    private String name;
    private int age;

    public Human() {               // default constructor 
        name = "Saketh";
        age = 21;
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

public class demo {
    public static void main(String[] args) {
        Human obj1 = new Human();
        System.out.println(obj1.getName() + " " + obj1.getAge());
    }
}
