package string_programs;

public class string_builder_reverse {
    public static void main(String[] args) {
        String s = "java";

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println("Reversed: " + sb);
    }
}
