import java.util.HashSet;
import java.util.Set;

public class hashingset {
    public static void main(String[] args) {
        Set<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(10);
        h.add(30);
        h.add(40);
        h.add(30);
      System.out.println( h.contains(10));
        System.out.println(h);
        h.remove(20);
        System.out.println(h);
     System.out.println( h.size());
    }
}
