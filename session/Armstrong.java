package session;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArm(153));
    }

    static Boolean isArm(int n){
        int og =n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, digits);
            n/=10;
        }

        return sum == og;
    }
}
