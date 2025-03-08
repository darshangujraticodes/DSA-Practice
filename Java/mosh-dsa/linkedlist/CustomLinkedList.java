import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    // isEmpty
    private boolean isEmpty() {
        return head == null;
    }

    // addFirst()
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    // addLast()
    public void addLast(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // removeFirst()
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            var second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    // removeLast()
    public void removeLast() {
        var previous = getPreviousNode(tail);
        tail = previous;
        tail.next = null;
        size--;
    }

    // previousNode
    public Node getPreviousNode(Node node) {

        var current = head;

        while (current != null) {
            if (current.next == tail)
                return current;
            current = current.next;
        }
        return null;
    }

    // remove()
    public void remove(int itemVal) {

        if (head == null)
            throw new NoSuchElementException();

        if (head.value == itemVal) {
            head = head.next;
            return;
        }

        var current = head;
        while (current != null && current.next.value != itemVal) {
            current = current.next;
        }

        if (current.next != null)
            current.next = current.next.next;
    }

    // contains hardwork method
    public boolean contains(int itemVal) {
        var current = head;
        while (current != null) {
            if (current.value == itemVal)
                return true;
            current = current.next;
        }
        return false;
    }

    // contains smartwork method
    public boolean containsCheck(int itemVal) {
        return indexOf(itemVal) != -1;
    }

    // indexOf
    public int indexOf(int itemVal) {
        int index = 0;
        var current = head;

        while (current != null) {
            if (current.value == itemVal) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    // print
    public void print() {
        var current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    // size
    public int size() {
        return size;
    }

    // toArray
    public int[] toArray() {
        int index = 0;
        int[] array = new int[size];
        var current = head;
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

}
