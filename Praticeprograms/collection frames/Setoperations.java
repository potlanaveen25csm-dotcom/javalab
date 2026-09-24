
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Setoperations {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        Set<Integer> ls=new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        ls.add(20);
        ls.add(100);
        ls.add(90);
        ls.add(70);
        ls.add(60);


       System.out.println( hs.addAll(ls));
       System.out.println(hs);
System.out.println(hs.retainAll(ls));
System.out.println(hs);
System.out.println(hs.removeAll(ls));
System.out.println(hs);
System.out.println(hs.containsAll(ls));
System.out.println(hs);
        
    }
    
}
