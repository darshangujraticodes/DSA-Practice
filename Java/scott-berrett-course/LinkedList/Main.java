public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(2);
        ll.appendNode(3);
        ll.appendNode(4);
        ll.appendNode(5);
        ll.appendNode(6);

        ll.prependNode(1);

        ll.getHead();
        ll.getTail();
        ll.getLength();

        ll.printNodeItems();

        ll.getNodeValue(2);
        ll.setNodeValue(2, 10);
        ll.getNodeValue(2);

        ll.removeLastNode();
        ll.removeLastNode();

        ll.removeFirstNode();
        ll.removeFirstNode();

        ll.printNodeItems();
        ll.getLength();

        ll.printNodeItems();

    }
}
