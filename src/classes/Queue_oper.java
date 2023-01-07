
import java.util.*;
//Position this line where user code will be pasted.
// Driver class with driver code
class Queue_oper {

    // Driver code
    public static void main (String[] args) {

        // Taking input using scanner class
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while(testcase-- > 0){
            // Declaring Queue
            Queue<Integer> q = new LinkedList<>();
            int n = sc.nextInt();

            // Invoking object of Geeks class
            Geeks_2 obj = new Geeks_2();

            for(int i = 0;i<n;i++){
                int k = sc.nextInt();
                obj.insert(q, k);
            }

            int x = sc.nextInt();
            for(int i = 0;i<x;i++){
                int k = sc.nextInt();
                int f = obj.findFrequency(q, k);
                if(f != 0){
                    System.out.println(f);
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.
Input:
1
8
1 2 3 4 5 2 3 1
5
1 3 2 9 10
Output:
2
2
2
-1
-1

Explanation:
Testcase 1: After inserting 1, 2, 3, 4, 5, 2, 3, 1 into the queue, frequency of 1 is 2, 3 is 2, 2 is 2, 9 is -1 and 10 is -1 (since, 9 and 10 is not there in the queue).


*/

//User function Template for Java
// Helper class Geeks to implement
// insert() and findFrequency()
class Geeks_2{

    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){

        // Your code here
        q.add(k);
    }

    // Function to find frequency of an element
    // return the frequency of k
    static int findFrequency(Queue<Integer> q, int k){

        // Your code here
        int count=0;
        Iterator value = q.iterator();
        while(value.hasNext())
        {
            if((int)value.next()==k)
                count = count+1;
        }
        return count;
    }

}