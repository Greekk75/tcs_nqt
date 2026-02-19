package session;

import java.util.Scanner;

public class DifBet_Position {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        int os =0;
        int es =0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i)-'0';
            //4567
            if((i+1)%2==0){
                es+=digit;
            }
            else {
                os+=digit;
            }
        }
        System.out.println(es-os);
    }
}
