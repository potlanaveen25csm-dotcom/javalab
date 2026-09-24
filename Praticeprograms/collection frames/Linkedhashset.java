import java.util.Set;
import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
        
        Set<Integer> lh=new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(20);
        System.out.println(lh);
        System.out.println(lh.size());
        System.out.println(lh.isEmpty());
        lh.remove(20);
        System.out.println(lh);
    }
    
}
