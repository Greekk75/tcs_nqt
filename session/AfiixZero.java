package session;

import java.util.Scanner;

public class AfiixZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int widht = String.valueOf(n).length();

        for (int i = m; i <=n ; i++) {
            System.out.printf("%0"+widht+"d ",i);
        }
//
//        double a = 2343.123456;
//
//        System.out.printf("%.3f",a);

    }
}
