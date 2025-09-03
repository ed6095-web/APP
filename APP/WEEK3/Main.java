//  Create a class named Rectangle with attributes width and height (both double). Create 
// methods to calculate the area and perimeter of the rectangle. Create a Rectangle 
// object, set its dimensions, and calculate and print its area and perimeter. 

class Rectangle {
    double width;
    double height;

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5.5;
        rect.height = 3.2;

        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
