package array_programs;
import java.util.*;
public class dynamic_array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // Access Elements
        System.out.println(list.get(0)); 
        System.out.println(list.get(1)); 
        System.out.println(list.get(2)); 

        //Update Element
        list.set(1, 50); 
        
        //Remove Element
        list.remove(1); 

        //Size of List
        System.out.println(list.size());

    }
}
