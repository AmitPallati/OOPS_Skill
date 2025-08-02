package CSIT;
import java.util.Scanner;

public class TrimExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String raw = scanner.nextLine();

        System.out.println("Before Trim: [" + raw + "]");
        System.out.println("After Trim: [" + raw.trim() + "]");
        scanner.close();
    }
}