import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
 */
public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    private Node head;
    private static LinkedList create_node(LinkedList list,int val){
        Node new_node = new Node(val);
        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node tail = list.head;
            while(tail.next!=null){
                tail = tail.next;
            }
            tail.next = new Node(val);
        }
        return list;
    }
    private static Node reverseKAltNodes(Node head,int k) {
        Node curr = head;
        Node prev = null;
        Node nex;
        int count = 0;
        while (curr != null && count < k) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            count++;
        }
        if (head != null) {
            head.next = curr;
        }
        count = 0;
        while (curr != null && count < k - 1) {
            curr = curr.next;
            count++;
        }
        if (curr != null) {
            curr.next = reverseKAltNodes(curr.next, k);
        }
        return prev;
    }
    private static Node sumOfNumbers(Node head,Node head1){
        Stack<Integer> s = new Stack<>(),s1 = new Stack<>();
        if(head==null && head1==null){
            return null;
        }
        else if(head==null){
            return head1;
        }
        else if(head1==null){
            return head;
        }
        else {
            while (head != null) {
                s.push(head.data);
                head = head.next;
            }
            while (head1 != null) {
                s1.push(head1.data);
                head1 = head1.next;
            }
            Node temp=null,prev=null;
            int carry = 0;
            while(!s.empty() || !s1.empty()){
                int sum = 0;
                if(!s.empty()){
                    sum += s.pop();
                }
                if(!s1.empty()){
                    sum += s1.pop();
                }
                temp = new Node((sum+carry)%10);
                temp.next = prev;
                prev = temp;
                carry = (sum+carry)/10;
            }
            if(carry > 0){
                temp = new Node(carry);
                temp.next = prev;
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        //int k = sc.nextInt();
        LinkedList li = new LinkedList();
        LinkedList li1 = new LinkedList();
        for(int i=0;i<n;i++){
            li = create_node(li,sc.nextInt());
        }
        for(int i=0;i<n1;i++){
            li1 = create_node(li1,sc.nextInt());
        }
        LinkedList li2 = new LinkedList();
        li2.head = sumOfNumbers(li.head,li1.head);
        //li.head = reverseKAltNodes(li.head,k);
        Node temp = li2.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
