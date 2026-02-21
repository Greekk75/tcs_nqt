package Numbers;

public class DeciToBinary {
    public static void main(String[] args) {
        int num =13;
        int digit = digits(num);
        StringBuilder sb = new StringBuilder();

        while(num>0){
            int rem = num % 2;
            sb.append(rem);
            num = num/2;
        }
        System.out.println(sb.reverse());
    }

    public static int digits(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}
