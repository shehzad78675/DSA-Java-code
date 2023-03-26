package BinaryTree;

class DiameterOfTree2{
    static class Info{
        int diameter;
        int height;

        Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
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

    public static Info diameterOfTree(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info linfo = diameterOfTree(root.left);
        Info rinfo = diameterOfTree(root.right);

        int finalDia = Math.max(linfo.height + rinfo.height + 1,Math.max(linfo.diameter, rinfo.diameter));
        int finalHeight = Math.max(linfo.height, rinfo.height) + 1;

        return new Info(finalDia, finalHeight);
    }
     
    public static void main(String[] args) {
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = bulidTree(arr);
        Info info = diameterOfTree(root);

        System.out.println("Diameter " + info.diameter + " Height " + info.height);

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(6);
        root1.left.right.right.right = new Node(7);
        Info info1 = diameterOfTree(root1);
        System.out.println("Diameter " + info1.diameter + " Height " + info1.height);
    }
}