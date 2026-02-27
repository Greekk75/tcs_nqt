package Live;

import java.util.Scanner;

public class day03_TreasureHunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] parts = s.split(" ");
        int n = Integer.parseInt(parts[0]);

        int[] arr= new int[n];
        int min = Integer.MAX_VALUE;
        int max =Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(parts[i+1]);
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(max-min);

    }
}
