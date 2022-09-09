import java.util.LinkedList;
import java.util.List;

public class prgm11 {
    public static void main(String[] args){
        LinkedList<Character> ll = new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original contents:" +ll);
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\nAfter calls to addFirst() and addLast().");
        System.out.println("Contents:" +ll);
        ll.add(2,'D');
        ll.add(2, 'C');
        System.out.println("\nAfter Insertion.");
        System.out.println("Contents:" +ll);
        System.out.println("\nhere are the First and Last element:"+ll.getFirst()+" "+ll.getLast());
        List<Character> sub=ll.subList(2,5);
        System.out.println("\n Contents of sublist view:"+sub);
        LinkedList<Character> ll2=new  LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll.");
        System.out.println("Contents:" +ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("\nAfter deleting first and last element");
        System.out.println("Contents:" +ll);
        ll.set(0,Character.toLowerCase(ll.get(0)));
        System.out.println("\n After change:"+ll);
    }
}
