package Set;

import java.util.HashSet;
import java.util.Scanner;

public class SumTOK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr =  new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i <n ;i++){
            arr[i]= in.nextInt();
        }

        int k = in.nextInt();

        for (int num : arr){
            int complement = k - num;
            if(set.contains(complement)){
                System.out.println("yess");
                return;
            }
            set.add(num);
        }
        System.out.println("no");
    }
}
