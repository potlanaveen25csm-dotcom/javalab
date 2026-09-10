package Two;

import One.A;

public class B extends A {

    int z = 30;

    void p() {
        System.out.println(x);
        System.out.println(y);
        one();
        two();
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.p();
    }
}