package Set;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDupsString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        HashSet<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
