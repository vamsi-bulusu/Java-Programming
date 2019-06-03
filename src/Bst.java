/**
 * https://www.geeksforgeeks.org/print-left-view-binary-tree/
 * https://www.geeksforgeeks.org/iterate-map-java/
 * https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
 * https://www.geeksforgeeks.org/modify-binary-tree-get-preorder-traversal-using-right-pointers/
 * https://www.youtube.com/watch?v=zgmdmqNePio#action=share
 */

import java.util.*;
import java.util.LinkedList;

public class Bst {

    class Node {
        int data;
        Node left, right;
        Node(int key){
            data = key;
            left=right=null;
        }
    }
    static private Node root;
    static private int max_level = 0;
    private Bst(){
        root = null;
    }
    private void insert_node(int val){
        root = insert_val(root,val);
    }
    private  Node insert_val(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        else if(root.data > val){
            root.left = insert_val(root.left,val);
        }
        else if(root.data < val){
            root.right = insert_val(root.right,val);
        }
        return root;
    }
    private void left_view(){
        leftViewNodes(root,1);
    }

    private void leftViewNodes(Node root,int level){
        if(root==null){
            return;
        }
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        leftViewNodes(root.left,level+1);
        leftViewNodes(root.right,level+1);
    }
    private void right_view(){
        rightViewNodes(root,1);
    }
    private void rightViewNodes(Node root,int level){
        if(root==null){
            return;
        }
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        rightViewNodes(root.right,level+1);
        rightViewNodes(root.left,level+1);
    }

    private void flatten(Node root){
        if(root==null || root.right==null && root.left==null){
            return;
        }
        if(root.left!=null){
            flatten(root.left);
            Node rightNode = root.right;
            root.right = root.left;
            root.left = null;

            Node t = root.right;
            while(t.right!=null){
                t = t.right;
            }
            t.right = rightNode;
        }
        flatten(root.right);
    }
    private void topViewNodes(Node root) {
        class QueueObj{
            private int hd;
            private Node node;
            private QueueObj(Node node,int hd) {
                this.hd = hd;
                this.node = node;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer,Node> m = new TreeMap<>();
        if(root==null){
            return;
        }
        else{
            q.add(new QueueObj(root,0));
        }
        System.out.println("Top view of tree: ");

            while (!q.isEmpty()) {
                QueueObj new_obj = q.poll();
                if (!m.containsKey(new_obj.hd)) {
                    m.put(new_obj.hd, new_obj.node);
                }
                if (new_obj.node.left != null) {
                    q.add(new QueueObj(new_obj.node.left, new_obj.hd - 1));
                }
                if (new_obj.node.right != null) {
                    q.add(new QueueObj(new_obj.node.right, new_obj.hd + 1));
                }
            }
        for (Node val:m.values()) {
            System.out.print(val.data+" ");
        }
    }
    private void inorder(Node root){
        if(root!=null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
  }
  private static boolean check_mirror(Node r1,Node r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.data==r2.data){
            if(check_mirror(r1.left,r2.right) && check_mirror(r1.right,r2.left)){
                return true;
            }
        }
        return false;
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bst bst1 = new Bst();
        Bst bst = new Bst();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            bst.insert_node(val);
        }
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            bst1.insert_node(val);
        }
        System.out.println(check_mirror(bst.root,bst1.root));
        //bst.left_view();
        //bst.right_view();
       // bst.topViewNodes(root);
        //bst.flatten(root);
        //bst.inorder(root);
    }
}
