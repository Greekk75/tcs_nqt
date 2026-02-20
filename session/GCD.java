package session;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int min = Math.min(n1,n2);

        for (int i =min ; i>=1 ; i--) {
            if(n1%i == 0 && n2 %i ==0){
                System.out.println(i);
                return;
            }
        }
    }
}
