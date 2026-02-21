package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }

        int m = in.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(in.nextInt());
        }

        if(set1.containsAll(set)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
