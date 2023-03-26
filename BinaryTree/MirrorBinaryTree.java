package BinaryTree;

public class MirrorBinaryTree {
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

    public static int mirrorBinaryTree(Node root){
        if(root == null){
            return 0;
        }

        int ldata = mirrorBinaryTree(root.left);
        int rdata = mirrorBinaryTree(root.right);

        if(root.left != null && root.right != null){

            root.right.data = ldata;
            root.left.data = rdata;
        }

        return root.data;
    }

    public static void preorderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preorderTraversal(root);
        System.out.println( );
        
        mirrorBinaryTree(root);
        preorderTraversal(root);
    }
}
