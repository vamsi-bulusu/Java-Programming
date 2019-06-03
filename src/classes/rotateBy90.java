package classes;

/**
 * https://www.geeksforgeeks.org/rotate-matrix-90-degree-without-using-extra-space-set-2/
 */
public class rotateBy90 {
    public static void rotate(int arr[][],int n){
        transpose(arr,n);
        reverseColumn(arr,n);
    }
    public static void transpose(int arr[][],int n){
         for(int i=0;i<n;i++){
             for(int j=i;j<n;j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
             }
         }
    }
    public static void reverseColumn(int arr[][],int n){
          for(int i=0;i<n;i++){
              for(int j=0,k=n-1;j<k;j++,k--){
                  int temp = arr[j][i];
                  arr[j][i] = arr[k][i];
                  arr[k][i] = temp;
              }
          }
    }
}
