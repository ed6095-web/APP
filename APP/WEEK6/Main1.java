// 2.Multilevel Inheritance 
// In a company, every person is an Employee. Some employees are Managers, and some managers are 
// SeniorManagers. 
// • Create a base class Employee with fields like name and salary. 
// • Derive Manager from Employee. 
// • Derive SeniorManager from Manager. 
// Show multilevel inheritance by displaying details at each level.

class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void showEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String n, double s, String d) {
        super(n, s);
        department = d;
    }

    void showManager() {
        showEmployee();
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    int teamSize;

    SeniorManager(String n, double s, String d, int t) {
        super(n, s, d);
        teamSize = t;
    }

    void showSeniorManager() {
        showManager();
        System.out.println("Team Size: " + teamSize);
    }
}

public class Main1 {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Rahul", 85000, "IT", 12);
        sm.showSeniorManager();
    }
}
