package CSIT;

import java.util.Scanner;

public class StringbuilderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(0, Math.min(5, sb.length()));
        sb.replace(0, Math.min(4, sb.length()), "Hi");
        sb.reverse();

        System.out.println("Modified StringBuilder: " + sb);
        scanner.close();
    }
}
