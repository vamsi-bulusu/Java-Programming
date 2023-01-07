import java.util.*;
public class Priority_Queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T!=0) {

            PriorityQueue<Integer> p_que = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    return o1.compareTo(o2);
                }
            });
            int N = sc.nextInt();
            Geeks_3 g1 = new Geeks_3();
            for(int i = 0;i<N;i++){
                int k = sc.nextInt();
                g1.insert(p_que, k);
            }
            System.out.println(p_que);
            int x = sc.nextInt();
            for(int i = 0;i<x;i++){
                int k = sc.nextInt();
                boolean f = g1.find(p_que, k);
                if(f != false){
                    System.out.println("1");
                    System.out.println(g1.delete(p_que));
                }
                else{
                    System.out.println("-1");
                }
            }

        T = T - 1;
        }

    }
}
class Geeks_3{

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){

        // Your code here
        //Just insert k in q
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){

        // Your code here
        // If k is in q return true else return false
        if(q.contains(k))
        {
            return true;
        }
        else {
            return false;
        }

    }

    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q){
        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
          int max = 0;
          Iterator iter = q.iterator();
          while(iter.hasNext())
          {
              int k = (int)iter.next();
              if( k >= max)
                  max = k;
          }
          q.remove(max);
          return max;
    }

}
