package CSIT;

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Substring from index 5: " + (s.length() >= 5 ? s.substring(5) : "Too short"));
        System.out.println("Substring (2, 7): " + (s.length() >= 7 ? s.substring(2, 7) : "Too short"));
        scanner.close();
    }
}