// 4.Create a class named Car with the following attributes: 
// ➢ model (String) 
// ➢ year (int) 
// ➢ color (String) 
// Create a constructor to initialize these attributes. Create a method displayCarInfo() to 
// print the car's information. Create two Car objects and display their information.

class Car {
    String model;
    int year;
    String color;

    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 2023, "Red");
        Car car2 = new Car("BMW X5", 2022, "Black");

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
