package session;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                if(n!=n/i && i!=n/i){
                    sum+=n/i;
                }
            }
        }
        if(sum==n){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
