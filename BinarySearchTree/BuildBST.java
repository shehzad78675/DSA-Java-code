package BinarySearchTree;

public class BuildBST {
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
    public static Node buildBST(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        System.out.println(data);
        if(root.data>data){
            root.left = buildBST(root.left, data);
        }else{
            root.right = buildBST(root.right, data);
        }
        return root;
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
        int arr[] = {5,1,3,4,2,7};
        Node root = buildBST(null, 5);
        root = buildBST(null, 6);
        // for(int i=0; i<arr.length; i++){
        //     root = buildBST(null, arr[i]);
        // }
        inorderTraversal(root);
    }
}
