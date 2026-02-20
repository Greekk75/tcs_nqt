package session;

import java.util.*;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,1,2};
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i =n-1 ; i >=0 ; i--){
            if(arr[i]>max){
                max = arr[i];
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        System.out.println(res);
    }
}
