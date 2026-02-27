package Live;

public class day03_reverse_Integer {
    public static void main(String[] args) {
        int n =42;
        boolean isNegative = n<0;

        String s = Integer.toString(Math.abs(n));
        String rev =new StringBuilder(s).reverse().toString();

        int res = Integer.parseInt(rev);

        if(isNegative){
            System.out.println(-res);
        }
        else {
            System.out.println(res);
        }
    }

}
