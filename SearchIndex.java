package CSIT;

import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Index of 'o': " + s.indexOf("o"));
        System.out.println("Last index of 'na': " + s.lastIndexOf("na"));
        System.out.println("Contains 'nan': " + s.contains("nan"));
        scanner.close();
    }
}