package BinaryTree;

public class TransformToSum {
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

    public static int transformToSum(Node root){
        if(root == null){
            return 0;
        }

        int lSum = transformToSum(root.left);
        int rSum = transformToSum(root.right);

        int data = root.data;

        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;

        root.data = lSum + leftData + rSum + rightData;
        return data;
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
        root.right.right = new Node(6);

        transformToSum(root);
        preorderTraversal(root);
        // preorderTraversal(root1);
    }
}
