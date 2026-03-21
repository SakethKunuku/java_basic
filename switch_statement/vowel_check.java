package switch_statement;

public class vowel_check {
    public static void main(String[] args) {
        char letter = 'A';

        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel.");
                break;
            default:
                System.out.println(letter + " is not a vowel.");
        }
    }
    
}
