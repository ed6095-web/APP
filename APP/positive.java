// Continuously prompt the user to enter a positive number until they
// provide a valid input.

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive number: ");
            n = a.nextInt();
        } while (n <= 0);
        System.out.println("You entered: " + n);
    }
}