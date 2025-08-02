package CSIT;

import java.util.Scanner;

public class SubstringExampl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();

        int end = Math.min(11, s1.length());
        if (s1.length() >= 11) {
            String sub = s1.substring(4, end);
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("String too short for extraction.");
        }
        scanner.close();
    }
}