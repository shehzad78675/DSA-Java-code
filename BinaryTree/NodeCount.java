package BinaryTree;

public class NodeCount {
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
     
    public static int nodeCount(Node root){
        if(root == null){
            return 0;
        }

        int lCount = nodeCount(root.left);
        int rCount = nodeCount(root.right);
        
        return lCount + rCount + 1;
    }
    public static void main(String[] args) {
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = bulidTree(arr);
        System.out.println(nodeCount(root));

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(6);
        root1.left.right.right.right = new Node(7);
        System.out.println(nodeCount(root1));
    }
}
