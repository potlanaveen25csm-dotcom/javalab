interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("this inherit from interface a");
    }

    public void showB() {
        System.out.println("inherit from interface b");
    }
    void showC(){
        System.out.println("this from class c");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
