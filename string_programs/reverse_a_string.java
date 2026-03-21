package string_programs;

public class reverse_a_string {
    public static void main(String[] args) {
        String s = "Saketh Kunuku";
        String rev_s = "";
        for(int i = s.length() - 1; i>=0;i--){
            rev_s += s.charAt(i);
        }
        System.out.println("original: " +s);
        System.out.println("reversed: "+rev_s);
    }
}
