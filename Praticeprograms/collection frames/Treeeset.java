import java.util.Set;
import java.util.TreeSet;


public class Treeeset {
    public static void main(String[] args) {
        
        Set<Integer> ts=new TreeSet<Integer>();
    ts.add(40);
    ts.add(20);
    ts.add(30);
    ts.add(10);
    System.out.println(ts);
    ts.remove(30);
    System.out.println(ts);
    }
}
