// 1.Single Inheritance 
// A school has teachers. Create a base class Teacher with details like name and subject. From it, derive 
// a class MathTeacher that adds details like number of classes handled. Demonstrate single 
// inheritance.


class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class MathTeacher extends Teacher {
    int classes;

    MathTeacher(String n, String s, int c) {
        super(n, s);
        classes = c;
    }

    void showMathDetails() {
        showDetails();
        System.out.println("Classes handled: " + classes);
    }
}

public class Main {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("Mr. Sharma", "Mathematics", 5);
        mt.showMathDetails();
    }
}
