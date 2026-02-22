class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println(name + " performance is good.");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }
}

public class P2 {
    public static void main(String[] args) {
        Manager m = new Manager("Ritesh", "Kolhapur", 70000);
        m.calculateBonus();
        m.performanceReport();
        m.manageProject();
    }
}