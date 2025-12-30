import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine(); // user input string

        boolean hasNumber = pass.matches(".*\\d.*"); // regex literal
        boolean hasSpecial = pass.matches(".*[^a-zA-Z0-9].*");

        String lower = pass.toLowerCase(); // convert to lowercase

        String strength;
        if (pass.length() >= 8 && hasNumber && hasSpecial) {
            strength = "Strong"; // string literal
        } else if (pass.length() >= 5) {
            strength = "Medium";
        } else {
            strength = "Weak";
        }

        System.out.println("\n--- Password Report ---");
        System.out.println("Password         : " + pass);
        System.out.println("Length           : " + pass.length());
        System.out.println("Has Number?      : " + hasNumber);
        System.out.println("Has Special Char?: " + hasSpecial);
        System.out.println("Lowercase sample : " + lower.charAt(0));
        System.out.println("Strength         : " + strength);

        sc.close();
    }
}
