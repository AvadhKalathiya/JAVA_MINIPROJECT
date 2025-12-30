public class StringDemo {
    public static void main(String[] args) {

        String name = "  Avadh Kalathiya  ";

        System.out.println("Length: " + name.length());
        System.out.println("Char at 2: " + name.charAt(2));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Trimmed: [" + name.trim() + "]");
        System.out.println("Contains 'Kal': " + name.contains("Kal"));
        System.out.println("Replace 'a' with '@': " + name.replace('a', '@'));

        String clean = name.trim();
        System.out.println("Equals 'avadh kalathiya'? " + clean.equalsIgnoreCase("avadh kalathiya"));

        String skills = "Java,DSA,WebDev";
        String[] arr = skills.split(",");
        System.out.println("After Split, 2nd skill: " + arr[1]);

        System.out.println("Index of 'K': " + clean.indexOf('K'));
        System.out.println("Last index of 'a': " + clean.lastIndexOf('a'));
    }
}
