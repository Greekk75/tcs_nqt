package session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringCompresor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr= new char[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.next().charAt(0);
        }

        ArrayList<Character> list = new ArrayList<>();
        int i=0;
        while(i<n){
            char ch = arr[i];
            int count =0 ;
            while(i<n && arr[i]==ch){
                count++;
                i++;
            }
            list.add(ch);
            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    list.add(c);
                }
            }
        }
        System.out.println(list);
    }
}
