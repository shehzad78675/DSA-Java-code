package BinaryTree;

import java.util.ArrayList;

public class FindKthAncestor {
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

    public static boolean findAncestors(Node root, int n, ArrayList<Node> ancestors){
        if(root == null){
            return false;
        }

        ancestors.add(root);

        if(root.data == n){
            return true;
        }

        boolean lAnc = findAncestors(root.left, n, ancestors);
        boolean rAnc = findAncestors(root.right, n, ancestors);

        if(lAnc || rAnc){
            return true;
        }

        ancestors.remove(ancestors.size()-1);
        return false;
    }

    public static int kthAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        ArrayList<Node> ancestors = new ArrayList<>();
        findAncestors(root, n, ancestors);

        if(k >= ancestors.size()){
            return -1;
        }
        return ancestors.get(ancestors.size()-1-k).data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(kthAncestor(root, 4, 0));
    }
}
