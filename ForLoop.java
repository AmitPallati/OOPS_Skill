package CSIT;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit for the count: ");

        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println("Count: " + i);
        }

        input.close();
    }
}