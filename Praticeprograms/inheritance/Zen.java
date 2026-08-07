public class Zen {
    int x=9;
    void display(){
        System.out.println("x value is :"+x);
    }
    public static void main(String[] args) {
        
    
    b z=new b();
    z.display();
    System.out.println(z.x);
    z.showsuper();
    z.add();
 }
}
class b extends Zen{
    int x=100;
    void display(){
        System.out.println("value of x is:"+x);
    }
    void add(){
        System.out.println("add is :"+(this.x+super.x));
    }
    void showsuper(){
        super.display();
    }
      
     
}