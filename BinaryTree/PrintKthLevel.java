package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintKthLevel {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        Node node;
        int level;

        Info(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void printKthLevel(Node root, int level){
        if(root == null){
            return;
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 1));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(curr.level == level){
                    System.out.print(curr.node.data + " ");
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.level+1));
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.level+1));
                }
            }
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printKthLevel(root, 2);
    }
}
