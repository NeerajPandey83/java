import java.util.LinkedHashSet;

public class PrintOnlyVowels {

	public static void main(String[] args)
	{
		String s= "Testyantra";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				System.out.println("The string contains "+s.charAt(i)+" at the index of "+ (i+1));
			}
		}
		
	}
}
