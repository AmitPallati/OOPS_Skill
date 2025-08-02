package CSIT;

import java.util.Scanner;

public class ConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Convert string to character array
        char[] chars = s.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Convert string to byte array (using default charset)
        byte[] bytes = s.getBytes();
        System.out.print("Bytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println(); // Add a newline for better formatting

        scanner.close();
    }
}