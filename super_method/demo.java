package super_method;
class A{                 
 // every class in java extends its object class.   
    public A(){
        super();
        System.out.println("Default constructor A --> IN");
    }
    public A(int n){
        super();
        System.out.println("Parameterised Constructor A --> IN");
    }
}
class B extends A{
    public B(){
        super();
        //super(5);
        System.out.println("Default Constructor B --> IN");
    }
    public B(int n){
        // super(); 
        //super(n);  
        this();  // this will call the constructor of the same class.   
        System.out.println("Parameterised Constructor B --> IN");
    }
}

public class demo {
    public static void main(String[] args) {
        //B bobj = new B();
        B bobj = new B(2);
    }
}
