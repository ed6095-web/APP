//  Create a class named Student with attributes name, rollNumber, and marks. Create a 
// method calculateGrade() to calculate the grade based on marks. Create a Student 
// object, set its details, calculate the grade, and print the student's information along 
// with the grade. 

class Student {
    String name;
    int rollNumber;
    double marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.rollNumber = 101;
        s.marks = 82.5;

        System.out.println("Name: " + s.name);
        System.out.println("Roll Number: " + s.rollNumber);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + s.calculateGrade());
    }
}
