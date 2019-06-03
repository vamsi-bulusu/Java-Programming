import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 */
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d){
         data = d;
         left=right=null;
    }
}
public class TreeTest{

    private static TreeNode createBalanced_BST(int arr[],int l,int r){
        if(l > r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = createBalanced_BST(arr,l,mid-1);
        node.right = createBalanced_BST(arr,mid+1,r);
        return node;
    }
    private static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        TreeNode root;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        root = createBalanced_BST(arr,0,n-1);
        preOrder(root);
    }
}
