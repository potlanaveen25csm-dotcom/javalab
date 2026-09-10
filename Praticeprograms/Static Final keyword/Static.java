class Static {
    String name;
    static String college = "ANITS";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }

    public static void main(String[] args) {
        Static s1 = new Static("Naveen");
        Static s2 = new Static("Rahul");

        s1.display();
        s2.display();

        Student.college = "AU";

        s1.display();
        s2.display();
    }
}