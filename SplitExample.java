package CSIT;

import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter comma-separated values: ");
        String s = scanner.nextLine();

        String[] items = s.split(",");
        for (String item : items) {
            System.out.println(item);
        }
        scanner.close();
    }
}