package session;

import java.util.Scanner;

public class Monkey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int k =in.nextInt();
        int j =in.nextInt();
        int m =in.nextInt();
        int p =in.nextInt();

        int bm = m/k;
        int pm = p/j;

        int res = n-(bm+pm);

        if(res < 0){
            res = 0;
        }
        System.out.println("Number of Monkey left on the Tree:"+res);
    }
}
