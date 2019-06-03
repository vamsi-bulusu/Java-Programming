package classes;

import java.math.BigInteger;

public class Geeks{

    static int count;
    public static void subset(int arr[],int start,int n,int sum){
        if(start>n)
            return;
        subset(arr,start+1,n,sum);
        if((sum+arr[start])%2==0)
            count++;
        subset(arr,start+1,n,sum+arr[start]);
    }
    public static int countSumSubsets(int arr[],int n)
    {
        count = 0;
        subset(arr,0,n-1,0);
        return count;
    }
    public static BigInteger fact(int n){
        BigInteger A = new BigInteger("1");
        for(int i=1;i<=n;i++){
            A = A.multiply(BigInteger.valueOf(i));
        }
        return A;
    }
}