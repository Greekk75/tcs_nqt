package Live;

import java.util.Scanner;

public class day03_toweOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int ans = (int)Math.pow(2,n)-1;
        System.out.println(ans);
    }
}
