public class LinkedList {

    class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    LinkedList(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length++;

    }

    public void appendNode(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            System.out.println("New Node " + newNode.value + " Appended!");
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("New Node " + newNode.value + " Appended!");
        }
        length++;
    }

    public void removeLastNode() {
        Node temp = head;
        Node pre = head;
        if (length == 0)
            return;

        if (length == 1) {
            head = null;
            tail = null;
            System.out.println("Last Node " + temp.value + " removed Successfuly!");
        } else {
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            System.out.println("Last Node " + temp.value + " removed Successfuly!");
        }
        length--;
    }

    public void removeFirstNode() {
        Node temp = head;
        if (length == 0)
            return;

        if (length == 1) {
            head = null;
            tail = null;
            System.out.println("First Node " + temp.value + " removed Successfuly!");
        } else {
            head = head.next;
            temp.next = null;
            System.out.println("First Node " + temp.value + " removed Successfuly!");
        }
        length--;
    }

    public void prependNode(int value) {
        Node newNode = new Node(value);
        Node temp = head;
        head = newNode;
        head.next = temp;
        length++;

        System.out.println(" Node is Prepend Successfuly! ");
    }

    public Node getNodeValue(int index) {

        if (length == 0) {
            System.out.println("Linked List is Empty!");
            return null;
        }

        if (index < 0 || index > length) {
            System.out.println("Invalid Index Value");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("Node Value is " + temp.value + " at index " + index);

        return temp;
    }

    public void setNodeValue(int index, int value) {
        if (length == 0)
            System.out.println("Linked List is Empty!");

        if (index < 0 || index > length)
            System.out.println("Invalid Index Value");

        Node temp = getNodeValue(index);
        temp.value = value;
        System.out.println("Node Value is Updated " + temp.value + " at index " + index);

    }

    public void printNodeItems() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head = " + head.value);
    }

    public void getTail() {
        System.out.println("Tail = " + tail.value);
    }

    public void getLength() {
        System.out.println("Length = " + length);
    }

}
