 abstract class A {
   abstract void dispaly();
   void play(){
    System.out.println("hello");
   }
    
}
class B extends A{
    @Override
    void dispaly(){
        System.out.println("name");
    }
}
public class Abstract {

    public static void main(String[] args) {
        B obj=new B();
        obj.dispaly();
        obj.play();
    }
}
