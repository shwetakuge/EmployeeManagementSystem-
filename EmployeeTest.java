class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rama", 50000);
        Employee emp2 = new Employee(102, "Shrata", 60000);
        Employee emp3 = new Employee(103, "Ravi", 55000);
        Employee emp4= new Employee(104, "Arihant", 75000);
        Employee emp5 = new Employee(105, "Sneha", 45000);


        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
