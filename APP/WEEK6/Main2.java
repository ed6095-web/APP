// 3.Hierarchical Inheritance 
// In a zoo, all animals share common properties like name and age. 
// • Create a base class Animal. 
// • Derive subclasses Lion, Elephant, and Monkey. 
// Each subclass should have its own method (e.g., roar, trumpet, climb). 
// Demonstrate hierarchical inheritance.

class Animal {
    String name;
    int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Lion extends Animal {
    Lion(String n, int a) {
        super(n, a);
    }

    void roar() {
        System.out.println(name + " roars loudly!");
    }
}

class Elephant extends Animal {
    Elephant(String n, int a) {
        super(n, a);
    }

    void trumpet() {
        System.out.println(name + " makes a trumpet sound!");
    }
}

class Monkey extends Animal {
    Monkey(String n, int a) {
        super(n, a);
    }

    void climb() {
        System.out.println(name + " climbs trees swiftly!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Lion l = new Lion("Simba", 5);
        l.showInfo();
        l.roar();

        Elephant e = new Elephant("Gajraj", 10);
        e.showInfo();
        e.trumpet();

        Monkey m = new Monkey("Chintu", 3);
        m.showInfo();
        m.climb();
    }
}
