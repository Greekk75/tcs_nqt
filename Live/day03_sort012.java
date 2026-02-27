package Live;

import java.util.Arrays;

public class day03_sort012 {
    public static void main(String[] args) {
        String s = "8 1 2 0 1 2 1 2 0";
        String[] parts = s.split(" ");
        int n = Integer.parseInt(parts[0]);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i+1]);
        }

        int count0 =0;
        int count1 =0;
        int count2 =0;
        System.out.println(Arrays.toString(arr));
        for (int i =0; i <n ; i++) {
            if (arr[i]==0) count0++;
            if (arr[i]==1) count1++;
            if (arr[i]==2) count2++;
        }
        int[] res = new int[n];
        int i =0;
        while(count0>0){
            res[i]=0;
            count0--;
            i++;
        }
        while(count1>0){
            res[i]=1;
            count1--;
            i++;
        }
        while(count2>0){
            res[i]=2;
            count2--;
            i++;
        }
        System.out.println(Arrays.toString(res));
    }
}
