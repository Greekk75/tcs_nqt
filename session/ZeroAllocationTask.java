package session;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroAllocationTask {
    public static void main(String[] args) {
        int[] arr ={1,0,5,0,0,3,2};

        int j =-1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;

        for (int i = j+1; i <arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
