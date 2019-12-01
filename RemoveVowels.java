/**
 * RemoveVowels
 */
public class RemoveVowels {

    public static void main(String args[])
    {
        String s="This website is for losers LOL!";
        System.out.println("The Result String is::"+disemvowel(s));
        
    }
    public static String disemvowel(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
                if(Character.toLowerCase(str.charAt(i))=='a' || Character.toLowerCase(str.charAt(i))=='e' || Character.toLowerCase(str.charAt(i))=='i' || Character.toLowerCase(str.charAt(i))=='o'|| Character.toLowerCase(str.charAt(i))=='u')
                    continue;
                else
                    sb.append(str.charAt(i));
            }           
        return sb.toString();
    }
}