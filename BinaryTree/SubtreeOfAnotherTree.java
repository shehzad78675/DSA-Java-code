package BinaryTree;

public class SubtreeOfAnotherTree {
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

    public static boolean isIdentical(Node root, Node subbTree){
        if(root == null && subbTree == null){
            return true;
        }else if(root == null || subbTree == null || root.data != subbTree.data){
            return false;
        }

        if(!isIdentical(root.left, subbTree.left)){
            return false;
        }

        if(!isIdentical(root.right, subbTree.right)){
            return false;
        }

        return true;
    }
    public static boolean subtreeOfAnotherTree(Node root, Node subtree){
        if(root == null){
            return false;
        }
        if(root.data == subtree.data){
            if(isIdentical(root, subtree)){
                return true;
            }
        }

        // boolean lAns = subtreeOfAnotherTree(root.left, subtree);
        // boolean rAns = subtreeOfAnotherTree(root.right, subtree);

        return subtreeOfAnotherTree(root.left, subtree) || subtreeOfAnotherTree(root.right, subtree);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(6);

        System.out.println(subtreeOfAnotherTree(root, subTree));
    }
}
