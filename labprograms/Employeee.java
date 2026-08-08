class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}

public class Employeee {
    public static void main(String[] args) {

        Employee e1 = new Employee("Naveen", 101);

        Employee e2 = new Employee("Rahul", 102, "Manager", 50000, "Promoted");

        e1.display();
        e2.display();
    }
}