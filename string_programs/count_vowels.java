package string_programs;

public class count_vowels {
    public static void main(String[] args) {
        String s = "hello world";
        int count = 0;

        for(char c : s.toCharArray()) {   // converts string to character array
            if("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Vowels count: " + count);
    }
}
