interface A {
    void showA();
}

interface B extends A {
    void showB();
}

interface C extends A {
    void showC();
}

class D implements B, C {
    public void showA() {
        System.out.println("THIS FROM INTERFACE A");
    }

    public void showB() {
        System.out.println("INHERIT FROM INTERFACE B");
    }

    public void showC() {
        System.out.println("INHERIT FROM INTERFACE C");
    }
    void showD(){
        System.out.println("this from class D");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}