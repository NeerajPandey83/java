import java.util.LinkedHashSet;

public class CharectorPositionReverseOrderWithDublicates
{

	public static void main(String[] args)
	{
		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			//System.out.println(set);
		}
		for(Character ch:set)
		{
			//int count = 0;
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
				
				}
			}
		}
	}
}
