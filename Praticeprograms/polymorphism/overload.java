 class A {

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    float sum(float x, int y, int z) {
        return x + y + z;
    }
}

class B extends A {

    int sum(int x, int y) {
        return x + y;
    }
    void play(){
        System.out.println(super.sum(10,20,30));
        System.out.println(super.sum(10.5f,20,20));
    }

}

public class overload {

    public static void main(String[] args) {

        B obj = new B();

        int result = obj.sum(10, 20);
        obj.play();


        System.out.println(result);
    }
}