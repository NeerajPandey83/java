
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str[] = {"a", "akasj", "abcd", "ab", "akjffm"};
		
		String max = str[0];
		
		for (int i=0; i<str.length; i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		
		System.out.println(max);
		String rev ="";
		for (int i = 0; i < max.length(); i++) 
		{
			rev = max.charAt(i)+rev;
			
		}
		System.out.println(rev);
//		for(int i=0; i<str.length; i++)
//		{
//			if(max.length()==str[i].length())
//				System.out.println(str[i]);
//		}
//		
		
	}

}
