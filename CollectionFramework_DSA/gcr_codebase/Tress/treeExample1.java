package Trees;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

class Node{
     int data;
     Node left; //by deafault null hota h
     Node right;

     Node(int data){
         this.data=data;
     }

 }
 public class treeExample1 {
     public static void preOrder(Node root){
         if(root == null){
             return;

         }
         System.out.print(root.data+" ");

         preOrder(root.left);
         preOrder(root.right);
     }
     public static void postOrder(Node root){
         if(root== null){
             return;
         }

         postOrder(root.left);
         postOrder(root.right);

         System.out.print(root.data+" ");

     }
     public static void levelOrderr(Node root){
         Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node ele  = q.poll();
            System.out.println(ele.data);

            if(ele.left != null) q.offer(ele.left);
            if(ele.right != null) q.offer(ele.right);
        }

     }
     public static void main(String[] args) {
         Node root= new Node(12);
         root.left=new Node(1);
         root.right=new Node(2);
         root.left.left=new Node(3);
         root.left.right= new Node(4);
         root.right.right= new Node(6);
         root.right.left= new Node(5);

         preOrder(root);
         postOrder(root);
         levelOrderr(root);
         // Print root


     }
}