package CSIT;

import java.util.Scanner;

public class CharLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("charAt(2): " + (s.length() > 2 ? s.charAt(2) : "Too short"));
        System.out.println("length(): " + s.length());
        scanner.close();
    }
}