// Calculate and print the simple interest for a given principal, rate, and
// number of years using a for loop.

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = a.nextDouble();
        System.out.print("Enter rate: ");
        double rate = a.nextDouble();
        System.out.print("Enter number of years: ");
        int years = a.nextInt();
        for (int i = 1; i <= years; i++) {
            double si = (principal * rate * i) / 100;
            System.out.println("Simple interest for " + i + " year(s): " + si);
        }
    }
}