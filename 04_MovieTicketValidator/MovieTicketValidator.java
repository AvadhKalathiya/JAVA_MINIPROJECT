import java.util.Scanner;

public class MovieTicketValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String literal
        String movie = "Inception";

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nSelect Show Time Slot:");
        System.out.println("1 - Morning  (₹150)");
        System.out.println("2 - Afternoon(₹200)");
        System.out.println("3 - Evening  (₹300)");
        System.out.println("4 - Night    (₹250)");
        System.out.print("Enter slot number: ");
        int slot = sc.nextInt();

        double price;

        // switch-case for price selection
        switch (slot) {
            case 1: price = 150; break;
            case 2: price = 200; break;
            case 3: price = 300; break;
            case 4: price = 250; break;
            default:
                System.out.println("Invalid show slot selected!");
                sc.close();
                return;
        }

        // if-else + relational + logical operators
        boolean isSenior = age >= 60;      // relational
        boolean isAdult  = age >= 18 && age < 60; // logical &&
        boolean isChild  = !(age >= 18);   // logical NOT !

        if (isSenior) {
            price = price - (price * 0.20); // 20% discount for seniors
            System.out.println("\nSenior Citizen Discount Applied!");
        } else if (isAdult) {
            System.out.println("\nTicket Category: Adult");
        } else if (isChild) {
            System.out.println("\nTicket Category: Child");
        } else {
            System.out.println("\nInvalid age for booking!");
            sc.close();
            return;
        }

        System.out.println("\n🎟 ---- Ticket Summary ----");
        System.out.println("Movie   : " + movie);
        System.out.println("Age     : " + age);
        System.out.println("Slot    : " + slot);
        System.out.println("Payable : ₹" + price);

        sc.close();
    }
}

