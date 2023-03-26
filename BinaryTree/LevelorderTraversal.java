package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {
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
     
    public static void levelorderTraversal(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                   q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = bulidTree(arr);
        levelorderTraversal(root);
    }
}
