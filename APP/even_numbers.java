// Find the sum of even numbers from 1 to a given number using a do-
// while loop.

import java.util.Scanner;

public class even_numbers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = a.nextInt();
        int sum = 0, i = 2;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= n);
        System.out.println("Sum of even numbers = " + sum);
    }
}