package StoryBased;

import java.util.HashMap;

public class three {
    public static void main(String[] args) {
        char[] arr ={'r','g','b','b','g','y','y'};

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(char c : arr){
            if(map.get(c) % 2 != 0){
                System.out.println(c);
                return;
            }
        }
        System.out.println("All are even");
    }
}
