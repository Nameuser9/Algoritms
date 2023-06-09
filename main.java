
public class Main {
    public static void main(String[] args) {
        linkedList test = new linkedList();
        linkedList.printList(linkedList.head);
        linkedList.addLast(1);
        linkedList.printList(linkedList.head);
        linkedList.addLast(2);
        linkedList.printList(linkedList.head);
        linkedList.addLast(3);
        linkedList.printList(linkedList.head);
        linkedList.addLast(4);
        linkedList.printList(linkedList.head);
        linkedList.addLast(5);
        linkedList.printList(linkedList.head);
        linkedList.addLast(6);
        linkedList.printList(linkedList.head);
        linkedList.reverts();
        //System.out.printf("123");
        linkedList.printList(linkedList.head);


    }
    public static Node head;
    public static Node tail;
    static class Node{
        public  int number;
        public  Node nextNode;
        public  Node prevNote;
    }
    public void reverseList(){
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;
        while (node.nextNode != null){
            temp = node.nextNode;
            node.nextNode = node.prevNote;
        }
    }
    public void reverseListALT(){
        Node current = head;
        Node next = current.nextNode;
        Node prev = current.prevNote;
        current.nextNode = prev;
        current.prevNote = next;
        if (prev == null)
            tail = current;
        if (next == null)
            head = current;
    }

    public static void addLast(int value) {
        Node node = new Node();
        node.number = value;
        if (tail != null) {
            node.prevNote = tail;
            tail.nextNode = node;
        } else {
            head = node;
        }
        tail = node;
    }

    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.number + " -> ");
            ptr = ptr.nextNode;
        }

        System.out.println("null");
    }
}
