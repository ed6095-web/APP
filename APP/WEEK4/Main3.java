// Static Method Usage 
// Create a class MathUtility with: 
// o A static method add(int, int) 
// o A non-static method multiply(int, int) 
// o Demonstrate calling both methods in main.

class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Main3 {
    public static void main(String[] args) {
        int sum = MathUtility.add(5, 10);
        System.out.println("Sum: " + sum);

        MathUtility obj = new MathUtility();
        int product = obj.multiply(5, 10);
        System.out.println("Product: " + product);
    }
}
