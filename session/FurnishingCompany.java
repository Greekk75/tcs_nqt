package session;

public class FurnishingCompany {
    public static void main(String[] args) {
        String s = "abaabaaaaa";
        int m = s.length();
        int l =3;

        int max =0;
        for (int i = 0; i < s.length(); i+=l) {
            int count =0;
            for (int j = i;j<i+l && j< m ; j++) {
                if(s.charAt(j)=='a'){
                    count++;
                }
            }
            max =Math.max(count,max);
        }
        System.out.println(max);
    }

}
