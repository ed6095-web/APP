// //Calculate and print the factorial of a given non-negative integer using a for loop.


// import java.util.Scanner;
// public class factorial{
//     public static void main(String[] args){
//     Scanner a = new Scanner(System.in);
//     System.out.print("Enter a non negative number = ");
//     int number = a.nextInt();
//     BigInteger factorial = 1;
//     for(int i = 1; i <= number; i++){
//         factorial *= i;
//     }
//     System.out.println("Factorial of " + number + " is = " + factorial);
// }
// }

import java.util.Scanner;
import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a non negative number (or -1 to exit) = ");
            int number = a.nextInt();
            if (number == -1) {
                System.out.println("Exiting...");
                break;
            }
            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                continue;
            }
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of " + number + " is = " + factorial);
        }
    }
}