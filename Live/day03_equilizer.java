package Live;

public class day03_equilizer {
    public static void main(String[] args) {
        int[] arr ={-7,1,5,2,-4,3,0};

        int total = 0;
        for(int n : arr){
            total+=n;
        }
        int lsum =0;
        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
            if(lsum==total){
                System.out.println(i);
                return;
            }
            lsum +=arr[i];
        }
    }
}
