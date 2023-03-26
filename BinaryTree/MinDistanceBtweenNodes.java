package BinaryTree;

public class MinDistanceBtweenNodes {
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

    public static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node righlca = lca(root.right, n1, n2);

        if(leftlca == null){
            return righlca;
        }

        if(righlca == null){
            return leftlca;
        }

        return root;
    }

    public static int lcaDis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int lDis = lcaDis(root.left, n);
        int rDis = lcaDis(root.right, n);

        if(lDis == -1 && rDis == -1){
            return -1;
        }else if(lDis == -1){
            return rDis+1;
        }else{
            return lDis+1;
        }
    }

    public static int minDistanceBetweenNodes(Node root, int n1, int n2){
        if(root == null){
            return 0;
        }

        Node lca = lca(root, n1, n2);

        int dis1 = lcaDis(lca, n1);
        int dis2 = lcaDis(lca, n2);

        return dis1 + dis2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(minDistanceBetweenNodes(root, 4, 6));
    }
}
