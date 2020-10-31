import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-31
 * Time:9:01
 **/
public class TestString {
    public static String connect(String str){
        String ret = "";
        String[] s = str.split("");
        for (String s1:s) {
            ret += s;
        }
return ret;
    }

    public static String reverse(String str,int begin,int end ){
        char[] ret = str.toCharArray();
        while(begin < end){
            char tmp = ret[begin];
            ret[begin] = ret[end];
            ret[end] = tmp;
            begin++;
            end--;

        }
        String str2 = new String(ret);
        return str2;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str = "a,b,c,d,e,f,g";
        reverse(str,0,k-1);
        reverse(str,k,str.length()-1);

        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
