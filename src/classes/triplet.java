package classes;

public class triplet {
    class Node {
        private int first;
        private int second;
        private int third;
        Node next;

        private Node(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
            next = null;
        }
    }
    public void print(int arr[]){
        print_triplets(get_triplets(arr));
    }
    private void print_triplets(Node head){
        while(head!=null){
            System.out.println(head.first+" "+head.second+" "+head.third);
            head = head.next;
        }
    }
    private Node get_triplets(int arr[]){
        int[] smaller = new int[arr.length];
        int[] greater = new int[arr.length];
        Node head = null,tail=null;
        int min=0,max = arr.length-1;
        smaller[min] = -1;
        greater[max] = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] <= arr[min]){
                min = i;
                smaller[i] = -1;
            }
            else {
                smaller[i] = min;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] >= arr[max]){
                max = i;
                greater[i] = -1;
            }
            else{
                greater[i] = max;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(smaller[i]!=-1 && greater[i]!=-1){
                if(head==null){
                    head = new Node(arr[smaller[i]],arr[i],arr[greater[i]]);
                    tail = head;
                }
                else{
                    tail.next = new Node(arr[smaller[i]],arr[i],arr[greater[i]]);
                    tail = tail.next;
                }
            }
        }
        return head;
    }
}
