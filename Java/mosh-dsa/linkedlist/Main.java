
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

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        ll.remove(1);

        System.out.println(ll + " size = " + ll.size());

    }
}
