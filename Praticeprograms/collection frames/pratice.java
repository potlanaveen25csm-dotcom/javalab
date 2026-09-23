import java.util.LinkedList;
import java.util.ArrayList;

public class pratice {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        LinkedList<Integer> li=new LinkedList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        li.add(50);
        li.add(60);
        li.add(70);
        li.add(80);
        System.out.println(al.get(1));
        System.out.println(li.get(1));
        al.remove(1);
        li.remove(1);
         System.out.println(al.get(1));
        System.out.println(li.get(1));
        System.out.println(al);
        System.out.println(li);

    }

    
}