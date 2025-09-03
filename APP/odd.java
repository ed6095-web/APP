// Print all odd numbers from 1 to a given number using a for loop.

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = a.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}