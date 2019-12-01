public class ConvertStringtoCharArray
{
		public static void main(String args[])
		{
			String ss = new String("given String");
			//ConvertStringtoCharArray
			char ch[]=ss.toCharArray();
			System.out.println("character array length"+ch.length);
			
			for (char chh:ch)
				System.out.println(chh);
		}
}