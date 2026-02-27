package Live;

import java.util.Scanner;

public class day03_gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1=temp;
        }
        System.out.println(n1);
    }

}
