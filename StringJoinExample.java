package CSIT;

import java.util.Scanner;

public class StringJoinExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String a = scanner.nextLine();
        System.out.print("Enter second word: ");
        String b = scanner.nextLine();

        System.out.println("Concatenated: " + a.concat(" ").concat(b));
        System.out.println("Joined: " + String.join("-", a, b, "C")); // Example of joining with a delimiter and multiple elements
        scanner.close();
    }
}