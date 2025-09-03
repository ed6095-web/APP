    class Student {
    String name;
    int regno;

    Student() {
        this.name = "VED BABU";//CONSTRUCTOR
        this.regno = 366;
    }
    Student(String name) {
        this.name = name;
        this.regno = 354; // Default regno
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regno);
    }
    
}
public class StudentMain1 {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student("ED");
        Student S3 = new Student("ED");
        S1.displayDetails();
        S2.displayDetails();
        S3.displayDetails();

        Student s = new Student();
        s.displayDetails();
    }
}
