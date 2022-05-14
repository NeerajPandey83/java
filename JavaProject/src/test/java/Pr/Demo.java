package Pr;

public class Demo 
{
	public static void main(String[] args) {
		
		String s = "abcdabcdabcd";
		
		for (char i = 'a'; i <='z'; i++) 
		{
			for (int j = 0; j < s.length(); j++)
			{
				if (i==s.charAt(j))
				{
					System.out.print(i);
				}
			}
		}
	}
}
