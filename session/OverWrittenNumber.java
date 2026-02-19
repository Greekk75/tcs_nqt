package session;
import java.util.*;

public class OverWrittenNumber {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        Arrays.sort(arr);
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if(arr[i]+1 != arr[i+1]){
                System.out.println(arr[i]+1);
                return;
            }
        }
    }
}
