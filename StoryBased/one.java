package StoryBased;

public class one {
    public static void main(String[] args) {
        String str ="****##";
        int star = 0;
        int hash = 0;

        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)=='*'){
                star++;
            }
            else if (str.charAt(i)=='#'){
                hash++;
            }
        }
        int res = star -hash;

        if(res>0){
            System.out.println("+"+res+" → means "+res+" '#' are needed to balance");
        }
        else if(res <0){
            System.out.println(res+" → means "+res+" '*' are needed to balance");
        }
        else{
            System.out.println(res+" → means '*' and '#' are equal");
        }
    }
}
