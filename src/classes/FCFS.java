import java.util.*;
public class FCFS {
    private int no_page_faults(int arr[],int n,int capacity)
    {
        Queue<Integer> new_que = new LinkedList<>();
        int page_faults=0,count=0;
        for(int i=0;i<n;i++)
        {
            boolean not_present = new_que.contains(arr[i]);
            if( !not_present && count<capacity)
            {
                count++;
                new_que.add(arr[i]);
                page_faults++;
            }
            else if(count==capacity && !not_present)
            {
                new_que.poll();
                new_que.add(arr[i]);
                page_faults++;
            }
        }
        return page_faults;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int capacity = sc.nextInt();
            FCFS obj = new FCFS();
            int x = obj.no_page_faults(arr,n,capacity);
            System.out.println(x);
        }
    }
}
