class Vehicle {
    protected int speed;
}

class Car extends Vehicle {
    public void setSpeed(int s) {
        speed = s;
    }

    public void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(120);
        c.showSpeed();
    }
}
