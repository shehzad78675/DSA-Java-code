package BinaryTree;

public class InorderTraversal {
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
    static int ind = -1;
    public static Node bulidTree(int arr[]){
        ind++;
        if(arr[ind] == -1){
            return null;
        }

        Node newNode = new Node(arr[ind]);
        newNode.left = bulidTree(arr);
        newNode.right = bulidTree(arr);

        return newNode;
    }
     
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = bulidTree(arr);
        inorderTraversal(root);
    }
}
