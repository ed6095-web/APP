// 5. Super keyword 
// In a Bank System: 
// • A base class Bank has a variable interestRate and a method displayRate(). 
// • A subclass SBI has its own variable interestRate and overrides the displayRate() method. 
// • Use super to display both the parent and child interest rates. 


class Bank {
    double interestRate = 5.0;

    void displayRate() {
        System.out.println("Bank Interest Rate: " + interestRate + "%");
    }
}

class SBI extends Bank {
    double interestRate = 6.5;

    @Override
    void displayRate() {
        System.out.println("SBI Interest Rate: " + interestRate + "%");
        super.displayRate(); // calling parent method
        System.out.println("Parent Interest Rate Variable: " + super.interestRate + "%");
    }
}

public class Main4 {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.displayRate();
    }
}
