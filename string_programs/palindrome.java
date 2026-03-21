package string_programs;

public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String s_rev = new StringBuilder(s).reverse().toString();
        if(s.equals(s_rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
