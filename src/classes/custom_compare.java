package classes;
import java.util.*;
import java.util.Comparator;

public class custom_compare{

    // Compare function


    public static void sortPairs(Pair arr[], int N){

        // Your code
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.x-o2.x;
            }
        });
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}