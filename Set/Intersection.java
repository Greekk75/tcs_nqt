package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Intersection {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HashSet<Integer> set =  new HashSet<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
        ArrayList<Integer> res = new ArrayList<>();

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int temp = in.nextInt();
            if (set.contains(temp)){
                res.add(temp);
            }
        }
        System.out.println(res);

    }
}
