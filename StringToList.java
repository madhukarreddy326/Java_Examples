import java.util.Arrays;
import java.util.List;

/**
 * StringToList
 */
public class StringToList {

    

    public static void main(String[] args) {
        
        String ss = new String ("madhukar reddy");
        System.out.println(ss);
        String s[]= ss.split(" ");
        System.out.println(s.length + "+" + s[0]);
        List<String> ls = Arrays.asList(s);
        System.out.println(ls);
    }
}