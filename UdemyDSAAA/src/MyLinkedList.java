public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            System.out.println("Node with a value of (" + value + ") created");
        }
    }

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {}

    public void prepend(int value) {}

    public boolean insert(int index, int value) { return false;}

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}