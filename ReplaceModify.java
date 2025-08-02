package CSIT;

import java.util.Scanner;

public class ReplaceModify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Replace 'a' with 'x': " + s.replace('a', 'x'));
        System.out.println("Replace 'ab' with 'xy': " + s.replace("ab", "xy"));
        // The replaceAll method uses regular expressions. "a." matches 'a' followed by any single character.
        System.out.println("ReplaceAll 'a.': " + s.replaceAll("a.", "z"));
        System.out.println("ReplaceFirst 'ab': " + s.replaceFirst("ab", "xy"));
        scanner.close();
    }
}