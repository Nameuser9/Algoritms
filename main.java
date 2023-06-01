import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class main {
    public class linkedList {
        protected Node head;
        protected Node tail;
        class Node{
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
    }
}

