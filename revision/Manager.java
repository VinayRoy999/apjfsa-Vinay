package revision;

// Employee class
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: Rupees " + salary);
    }
}

// Manager class inheriting from Employee
class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        //System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: Rupees " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Ram", 5000.0, "Marketing");
        manager.displayDetails();
    }
}
