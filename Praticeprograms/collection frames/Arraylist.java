import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object>obj=new ArrayList<>();
        obj.add("art");
        obj.add(20);
        obj.add(30.45f);
        System.out.println(obj);
        obj.addFirst(30);
        System.out.println(obj);
       System.out.println( obj.get(1));
     System.out.println(  obj.get(2));
     obj.removeFirst();
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj);
System.out.println(obj.isEmpty());
        
    }

    
}