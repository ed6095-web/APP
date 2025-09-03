abstract class Payment {
    abstract void makePayment(double amount);
}

class CreditCard extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class NetBanking extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}

class UPI extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class Bank {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new NetBanking();
        Payment p3 = new UPI();

        p1.makePayment(1000);
        p2.makePayment(2000);
        p3.makePayment(500);
    }
}