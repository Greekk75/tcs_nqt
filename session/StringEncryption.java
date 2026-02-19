package session;
import java.util.*;

public class StringEncryption {
    public static void main(String[] args) {
        String s = "Azbz92";
        char key = 3;
        StringBuilder res = new StringBuilder();

        if(key<=0){
            System.out.println("INVALID INPUT");
        }

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <='Z'){
                char newch = (char)(((ch-'A'+key)%26)+'A');
                res.append(newch);
            }
            else if(ch>='a' && ch <= 'z'){
                char newch = (char)(((ch-'a'+key)%26)+'a');
                res.append(newch);
            }
            else if(ch>='0' && ch <='9'){
                char newch = (char)(((ch-'0'+key)%10)+'0');
                res.append(newch);
            }
            else{
                res.append(ch);
            }
        }
        System.out.println(res);
    }
}
