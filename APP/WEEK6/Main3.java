// 4.Hybrid Inheritance 
// In an e-commerce system: 
// • Base class User contains name and email. 
// • Subclass Customer inherits from User. 
// • Subclass Seller also inherits from User. 
// • A class PrimeCustomer inherits from Customer and also implements an interface 
// PrimeFeatures. 
// This demonstrates hybrid inheritance (combination of hierarchical + interface-based 
// multiple inheritance).

class User {
    String name;
    String email;

    User(String n, String e) {
        name = n;
        email = e;
    }

    void showUser() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Customer extends User {
    Customer(String n, String e) {
        super(n, e);
    }

    void buy() {
        System.out.println(name + " is buying products.");
    }
}

class Seller extends User {
    Seller(String n, String e) {
        super(n, e);
    }

    void sell() {
        System.out.println(name + " is selling products.");
    }
}

interface PrimeFeatures {
    void freeDelivery();
    void primeDeals();
}

class PrimeCustomer extends Customer implements PrimeFeatures {
    PrimeCustomer(String n, String e) {
        super(n, e);
    }

    public void freeDelivery() {
        System.out.println(name + " gets free delivery.");
    }

    public void primeDeals() {
        System.out.println(name + " gets access to prime deals.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Customer c = new Customer("Arjun", "arjun@email.com");
        c.showUser();
        c.buy();

        Seller s = new Seller("Meera", "meera@email.com");
        s.showUser();
        s.sell();

        PrimeCustomer pc = new PrimeCustomer("Riya", "riya@email.com");
        pc.showUser();
        pc.buy();
        pc.freeDelivery();
        pc.primeDeals();
    }
}
