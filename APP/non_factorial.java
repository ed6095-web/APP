// Calculate the factorial of a non-negative number using a do-while
// loop.

import java.util.Scanner;

public class non_factorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = a.nextInt();
        int i = 1;
        long factorial = 1;
        if (n == 0) {
            factorial = 1;
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}