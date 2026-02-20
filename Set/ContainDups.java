package Set;

import java.util.*;

public class ContainDups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                System.out.println("yes");
                return;
            }
            set.add(num);
        }
        System.out.println("false");
    }
}
