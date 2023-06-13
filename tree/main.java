import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class main {
    public static void main (String args[]) {
        final tree tree = new tree();
        try (BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (Exception ignored) {}


        }} catch (IOException e) {
            throw new RuntimeException(e);
        }



    } protected enum Color{
        black , red;
    }
    public static class tree{
        private  Node root;

        public boolean add(int value){
            if (root!= null){
                boolean result = addNode(root, value);
                root = rebalance(root);
                root.color = Color.black;
                return result;
            } else {
                root = new Node();
                root.color = Color.black;
                root.value = value;
                return true;
            }

        }
        protected boolean addNode(Node node, int value) {
            if (node.value == value) {
                return false;
            } else {
                if(node.value > value) {
                    if (node.left != null) {
                        boolean result = addNode(node.left, value);
                        node.left = rebalance(node.left);
                        return result;
                    } else {
                        node.left = new Node();
                        node.left.color = Color.red;
                        node.left.value = value;
                        return true;
                    }
                }else {
                        if (node.right != null) {
                            boolean result = addNode(node.right, value);
                            node.right = rebalance(node.right);
                            return result;
                }else {
                            node.right = new Node();
                            node.right.color = Color.red;
                            node.right.value = value;
                            return true;
                        }


        }}}}
        protected static Node rebalance(Node node){
            Node result =node;
            boolean needRebalance;
            do {
                needRebalance = false;
                if (result.right != null || result.right.color == Color.red &&
                        (result.left == null || result.left.color ==Color.black)){
                    needRebalance = true;
                    result = rightTurn(result);
                }
                if (result.left != null && result.left.color == Color.red&&
                   result.left.left != null && result.left.left.color == Color.red){
                    needRebalance = true;
                    result = leftTurn(result);
                }
                if (result.left != null && result.left.color == Color.red &&
                    result.right != null && result.right.color ==Color.red) {
                    needRebalance = true;
                    colorswap(result);
                }
            }
            while (needRebalance);

            return result;
        }
        protected static Node rightTurn(Node node){
            Node rightchild = node.right;
            Node between = node.left;
            rightchild.left = node;
            node.right = between;
            rightchild.color = node.color;
            node.color = Color.red;
        return rightchild;
        }
        protected static Node leftTurn(Node node){
            Node leftchild = node.left;
            Node between = node.right;
            leftchild.right = node;
            node.left = between;
            leftchild.color = node.color;
            node.color = Color.red;
        return leftchild;
        }
        protected static void colorswap(Node node){
        node.left.color = Color.black;
        node.left.color = Color.black;
        node.color = Color.red;
        }
        private static class Node{
        int value;
        private Node left;
        private Node right;
        private Node parent;
        private main.Color color;
    }
    }





