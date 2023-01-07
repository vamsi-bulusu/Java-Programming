import java.util.*;
class ArrLis
{
    // Driver code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // Declaring ArrayList
            ArrayList <Integer> list = new ArrayList<Integer>();
            int q = sc.nextInt();

            // Working through queries
            while(q-- > 0)
            {
                char ch = sc.next().charAt(0);
                Geeks_1 obj = new Geeks_1();
                if(ch == 'a')
                {
                    int x = sc.nextInt();
                    obj.insert(list, x);
                }

                if(ch == 'i')
                {
                    obj.IncOrder(list);
                }

                if(ch == 's')
                {
                    int ele = sc.nextInt();
                    obj.Search(list, ele);
                }
                if(ch == 'd')
                {
                    obj.DecOrder(list);
                }


            }
        }
    }
}
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.
input - format
2
6
a 2 a 3 a 4 a 2 i s 2
5
a 2 a 3 a 3 d s 5
output - format
0
-1
*/

//User function Template for Java
// Helper class to handle functions insert(),
// IncOrder(), Search() and DecOrder()
class Geeks_1
{
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {


        /*
        Your Code here
         * */
        int flag = Collections.binarySearch(list,val);
        if(flag <= -1){
            System.out.println("-1");
        }
        else
        {
            while(flag>=0)
            {
                if(list.get(flag)==val && flag==0)
                {
                    System.out.println(flag);
                    break;
                }
                else if(list.get(flag)==val && flag>0)
                {
                    flag = flag - 1;
                }
                else
                {
                    System.out.println(flag+1);
                    break;
                }
            }
        }
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list, Collections.reverseOrder());
    }
}

