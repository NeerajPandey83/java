package Pr;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDublicate {
	public static void main(String[] args) {
		String s = "welcome back to to rewa";
		String [] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word:str)
		{
			set.add(word);
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
			if(count==1)
			{
				System.out.println(word1+"="+count);
			}
		}
			
	}

}
