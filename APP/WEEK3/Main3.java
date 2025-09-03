// Create a class named Person with attributes name, age, and address. Create a default 
// constructor and a parameterized constructor. Create a method displayPersonInfo() to 
// print the person's information. Create two Person objects, one using the default 
// constructor and the other using the parameterized constructor. Display information for 
// both object


import java.util.Scanner;

class Car {
    String model;
    int year;
    String color;

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Car car1 = new Car();
        System.out.print("Enter model for car 1: ");
        car1.model = a.nextLine();
        System.out.print("Enter year for car 1: ");
        car1.year = a.nextInt();
        a.nextLine();
        System.out.print("Enter color for car 1: ");
        car1.color = a.nextLine();

        Car car2 = new Car();
        System.out.print("Enter model for car 2: ");
        car2.model = a.nextLine();
        System.out.print("Enter year for car 2: ");
        car2.year = a.nextInt();
        a.nextLine(); // <-- important to clear buffer
        System.out.print("Enter color for car 2: ");
        car2.color = a.nextLine();

        System.out.println("\nCar 1 Information:");
        car1.displayCarInfo();
        System.out.println("Car 2 Information:");
        car2.displayCarInfo();

        a.close();
    }
}
