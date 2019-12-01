public class UpperLowerCase
{
		public static void main(String args[])
		{
				String ss = new String("hello Madhukar Reddy welcome to Chennai");
				System.out.println("The given String is:"+ss);
				processString(ss);
				
		}
		public static void processString(String ss)
		{
				System.out.println("The received String is:"+ss);
				String arr[]=ss.split(" ");
				//System.out.println(arr[0]);
				String splittedString[];
				boolean flag=true;
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<arr.length;i++)
				{
					
						
							
						splittedString = arr[i].split("");
						for(int j=0;j<splittedString.length;j++)
						{
								if(flag)
									sb.append(splittedString[j].toLowerCase());
								else
									sb.append(splittedString[j].toUpperCase());
								flag = !flag;
								
									
						}
						if(i%2 ==0)
							flag = true;	
						sb.append(" ");
						


				}
										System.out.println(sb);
				
		}
}