class Person { 
    String name = "Naveen"; 
    int age = 19; 
} 
 
class Student extends Person { 
    String course = "CSM"; 
} 
 
class Faculty extends Person { 
    String subject = "Java"; 
} 
 
public class Inheritance { 
    public static void main(String[] args) { 
        Student s = new Student(); 
        Faculty f = new Faculty(); 
 
        System.out.println("Student Name: " + s.name); 
        System.out.println("Student Age: " + s.age); 
        System.out.println("Student Course: " + s.course); 
 
        System.out.println("Faculty Name: " + f.name); 
        System.out.println("Faculty Age: " + f.age); 
        System.out.println("Faculty Subject: " + f.subject); 
    } 
}
