package session;

import java.util.Scanner;

public class MaximumSumFromCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int k = in.nextInt();
        int ans = maxCard(arr,k);
        System.out.println(ans);
    }

    public static int maxCard(int[] arr, int k) {
        int n=arr.length;
        int lsum =0;
        int rsum =0;

        for (int i =0;i<k;i++){
            lsum+=arr[i];
        }

        int l=k-1;
        int r=n-1;
        int max =lsum+rsum;

        while (l>=0){
            lsum-=arr[l];
            rsum+=arr[r];
            max = Math.max(max,lsum+rsum);
            l--;
            r--;
        }
        return max;
    }
}
