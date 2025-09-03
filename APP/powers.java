// Print the powers of 2 up to a given exponent using a do-while loop.

import java.util.Scanner;

public class powers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter exponent: ");
        int exponent = a.nextInt();
        int i = 0;
        do {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
            i++;
        } while (i <= exponent);
    }
}