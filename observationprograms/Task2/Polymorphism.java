class Area {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

class Vehicle {

    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {

    void display() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {

    void display() {
        System.out.println("This is a bike");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Circle: " + a.area(5.0));
        System.out.println("Area of Rectangle: " + a.area(10, 5));
        System.out.println("Area of Triangle: " + a.area(10.0, 5.0));

        System.out.println();

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.display();
        v2.display();
    }
}

