package CSIT;

import java.util.Scanner;

public class StringComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        System.out.println("Equals: " + a.equals(b));
        System.out.println("EqualsIgnoreCase: " + a.equalsIgnoreCase(b));
        System.out.println("CompareTo: " + a.compareTo(b));
        scanner.close();
    }
}