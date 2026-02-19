package session;

import java.util.Scanner;

public class Term15th {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int res =0 ;

        if(n%2!=0){
            int o = (n+1)/2;
            res = 7* (o-1);
        }
        else{
            int e = n/2;
            res = 6*(n-1);
        }

        System.out.println(n+" Term of the series is "+res);

    }
}
