/**
 * RemoveSpaceAndUnderscore
 */
public class RemoveSpaceAndUnderscore {

    public static void main(String args[])
    {
        String s = new String("The_Stealth_Warrior");
        System.out.println(s);        
        System.out.println((int)'-');//_:95,-:45
    
        char ch[]=s.toCharArray();
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)==45 || (int)s.charAt(i)==95)
            {
                sb.append(Character.toUpperCase(s.charAt(++i)));
            continue;
            }
            else
                sb.append(s.charAt(i));          
        }
       
    }
}