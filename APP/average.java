// Calculate the average of a series of numbers entered by the user using
// a while loop.

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true) {
            System.out.print("Enter a number (or -1 to finish): ");
            double num = a.nextDouble();
            if (num == -1) break;
            sum += num;
            count++;
        }
        if (count > 0) {
            System.out.println("Average = " + (sum / count));
        } else {
            System.out.println("No numbers entered.");
        }
    }
}