import java.util.LinkedHashSet;

public class RemoveDublicateFromString {

	public static void main(String[] args) {
		String s ="welcome to to testyantra";
		String[] str= s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word:str)
		{
			//System.out.println(word);
			set.add(word);
			//System.out.println(set);
		}
		
		for(String word1:set)
		{
			int count =0;
			for(String word2:str)
			{
				if(word2.equals(word1))
				{
					count++;
				}
			}
			System.out.println(word1+"="+count);
		}
		
		
	}
}
