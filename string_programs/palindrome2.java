package string_programs;

public class palindrome2 {
    public static void main(String[] args) {
        String s = "madam";
        int len_s = s.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len_s / 2; i++) {
            if (s.charAt(i) != s.charAt(len_s - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}