public class main {
    public static void main (){

    }
    static public class linkedList {
        protected Node head;
        protected Node tail;
        static class Node{
            protected int number;
            protected Node nextNode;
            protected Node prevNote;
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
        }
    }


