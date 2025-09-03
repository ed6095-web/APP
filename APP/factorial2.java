//Calculate and print the factorial of a given non-negative integer using a for loop.


import java.util.Scanner;
public class factorial2{
    public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    System.out.print("Enter a non negative number = ");
    int number = a.nextInt();
    long factorial = 1;
    for(int i = 1; i <= number; i++){
        factorial *= i;
    }
    System.out.println("Factorial of " + number + " is = " + factorial);
}
}