package classes;

/**
 * https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/
 */
public class maxOnes {
    public int find(int arr[][], int n) {
        int max = -1, max_index = 0;
        for (int i = 0; i < n; i++) {
            int index = count_max_ones(arr[i], 0, n - 1);
            if (index != -1 && n-index > max) {
                max = n-index;
                max_index = i;
            }
        }
        return max_index;
    }

    public int count_max_ones(int arr[], int start, int end) {
        if (end >= start){
            int mid = (start + end) / 2;
            if((mid==0 || arr[mid-1]==0) && (arr[mid]==1)){
                return mid;
            } else if (arr[mid] == 0) {
                return count_max_ones(arr, mid + 1, end);
            } else {
                return count_max_ones(arr, start, mid - 1);
            }
        }
        return -1;
    }
}
