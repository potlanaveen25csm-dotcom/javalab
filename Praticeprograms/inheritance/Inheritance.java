class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        display();
        System.out.println("Roll No: " + rollNo);
    }
}

class Faculty extends Person {

    String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayFaculty() {
        display();
        System.out.println("Subject: " + subject);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Student s = new Student("Naveen", 19, 101);
        Faculty f = new Faculty("Ravi", 40, "Java");

        System.out.println("Student Details:");
        s.displayStudent();

        System.out.println();

        System.out.println("Faculty Details:");
        f.displayFaculty();
    }
}
