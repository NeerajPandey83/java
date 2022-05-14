import java.util.LinkedHashSet;

public class NoDublicateFromStringUsingForLoop {

	public static void main(String[] args) 
	{
		String s ="welcome to to to testyantra";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();	
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}	
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(str[i].equals(word))
				{
					count++;
				}
			}
			System.out.println(word+"="+count);
		}
	}
}
