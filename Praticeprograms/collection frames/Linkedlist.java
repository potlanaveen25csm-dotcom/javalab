import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Add at index
        list.add(1, 15);
        System.out.println(list);

        // Add first and last
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);

        // Access
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Change
        list.set(2, 100);
        System.out.println(list);

        // Search
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));

        // Size
        System.out.println(list.size());

        // Remove
        list.remove(2);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }
}