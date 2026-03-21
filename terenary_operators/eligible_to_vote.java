package terenary_operators;

public class eligible_to_vote {
    public static void main(String[] args) {
        int age = 18;

        String eligibility = (age >= 18) ? "eligible to vote" : "not eligible to vote";
        System.out.println("At age " + age + ", you are " + eligibility + ".");
    }
    
}
