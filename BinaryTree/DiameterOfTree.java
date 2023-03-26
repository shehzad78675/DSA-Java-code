package BinaryTree;

public class DiameterOfTree {
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = heightOfTree(root.left);
        int rightCount = heightOfTree(root.right);

        return Math.max(leftCount, rightCount) + 1;
    }

    public static int diameterOfTree(Node root){
        if(root == null){
            return 0;
        }

        int lDia = diameterOfTree(root.left);
        int rDia = diameterOfTree(root.right);
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        int selfDia = lh + rh + 1;

        return Math.max(selfDia, Math.max(rDia, lDia));
    }
     
    public static void main(String[] args) {
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = bulidTree(arr);
        System.out.println(diameterOfTree(root));

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(6);
        root1.left.right.right.right = new Node(7);
        System.out.println(diameterOfTree(root1));
    }
}
