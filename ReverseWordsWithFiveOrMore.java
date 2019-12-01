/**
 * ReverseWordsWithFiveOrMore
 */
public class ReverseWordsWithFiveOrMore {

    public static void main(String args[])
    {
        String s="This is Madhukar";
        System.out.println("S is::"+s);
        System.out.println("Reverse String is::"+reverseString(s));
        
    }

    private static String reverseString(String s) {
       String ss[]=s.split(" ");
       StringBuffer sb =new StringBuffer() ;
       for(String s1:ss)
       {
          StringBuffer sb1 = new StringBuffer(s1);
           if(sb1.length()>=5)
            sb.append(sb1.reverse());
            else
                sb.append(sb1);
            sb.append(" ");
               
       }
       return sb.toString().trim();
    }
}