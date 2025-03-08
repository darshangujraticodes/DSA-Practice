
/*
 * 
 * Linked List :   A linked list is a linear data structure that stores elements in nodes that are linked together using pointers. 
 * 
 * It has 2 valuues : 
 * 1] value 
 * 2] address of next node
 * 3] first node is called head
 * 4] last node is called tail
 * 
 *  Worst case Time Complexity
 *  1] Lookup by index - O(n)
 *  2] Lookup by value : O(n)
 *  3] insert : O(n)  
 *  4] delete : O(n)
 * 
 *  LinkedList inbuild Collection api in Java
 *
 * 
 * 
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // linkedlist collection
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        // System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        ll.remove(1);

        // System.out.println(ll + " size = " + ll.size() + " contains = " +
        // ll.contains(40));

        var array = ll.toArray();

        // System.out.println(Arrays.toString(array));

        // --------------------------------------------

        // custom linkedlist

        var cll = new CustomLinkedList();
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);

        cll.addFirst(-10);
        cll.addFirst(-20);
        cll.addFirst(-30);

        cll.remove(10);

        // cll.removeFirst();

        // cll.removeLast();

        cll.print();

        System.out.println("Contains 30 = " + cll.contains(30));
        // System.out.println("Contains 130 = " + cll.contains(130));
        // System.out.println("Contains 20 = " + cll.containsCheck(20));
        System.out.println("Contains 80 = " + cll.containsCheck(80));

        System.out.println("indexof 10 = " + cll.indexOf(10));
        // System.out.println("indexof 50 = " + cll.indexOf(30));
        // System.out.println("indexof 80 = " + cll.indexOf(80));

        System.out.println("Linkedlist size = " + cll.size());

        System.out.println("Linkedlist Array = " + Arrays.toString(cll.toArray()));

    }
}
