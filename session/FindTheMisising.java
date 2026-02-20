package session;
import java.util.*;
public class FindTheMisising {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4};
        int n = arr.length;

        int actSum = (n*(n+1))/2;
        int sum =0;

        for (int i = 0; i <n; i++) {
            sum+=arr[i];
        }
        System.out.println(actSum-sum);
    }
}
