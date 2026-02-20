package Set;
import java.util.*;


public class CountDistinct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        System.out.println(set.size());

    }
}
