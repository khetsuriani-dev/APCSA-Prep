import java.util.*;

public class stringtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String:");
        String input = scanner.nextLine();

        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Length: " + input.length());

        System.out.println("Index: ");
        int index = scanner.nextInt();
        if(index >= 0 && index < input.length()) {
            System.out.println("Character at index " + index + ": " + input.charAt(index));
        } else {
            System.out.println("Error: Out of range");
        }
    }
}

// testing my string manipulation capabilities in java.
