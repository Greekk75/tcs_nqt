package session;

import java.util.*;

public class PartyAtCruise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine().trim();
        String line2 = in.nextLine().trim();

        line1 = line1.replaceAll("\\[|\\]","");
        line2 = line2.replaceAll("\\[|\\]","");

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        int[] arr1 = new int[parts1.length];
        int[] arr2 = new int[parts1.length];

        for(int i = 0 ;i< parts1.length;i++){
            arr1[i] = Integer.parseInt(parts1[i]);
            arr2[i] = Integer.parseInt(parts2[i]);
        }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        int max = 0;
        int rem =0;
        for (int i = 0; i < arr1.length; i++) {
            rem += arr1[i] - arr2[i];
            max =Math.max(max,rem);
        }
        System.out.println(max);
    }
}
