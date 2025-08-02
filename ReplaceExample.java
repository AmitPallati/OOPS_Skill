package CSIT;
import java.util.Scanner;

public class ReplaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String newSentence = sentence.replace("C", "Java");
        System.out.println("After Replace: " + newSentence);
        scanner.close();
    }
}