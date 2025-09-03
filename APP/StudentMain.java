    class Student {
    String name;
    int regno;

    Student() {
        this.name = "VED BABU";//CONSTRUCTOR
        this.regno = 366;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regno);
    }
    
}
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}
