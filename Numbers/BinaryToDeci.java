package Numbers;

public class BinaryToDeci {
    public static void main(String[] args) {
        String num = "1111";

        double sum = 0;
        int j=0;
        for (int i =num.length()-1;i>=0;i--) {
            if(num.charAt(i)=='1'){
                sum=sum+Math.pow(2,j);
            }
            j++;
        }
        System.out.println(sum);
    }
}
