package CSIT;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit for the count: ");

        int limit = input.nextInt();

        int i = 1;

        while (i <= limit) {
            System.out.println("i = " + i);
            i++;
        }

        input.close();
    }
}