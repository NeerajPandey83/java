
public class ReverseTheWord {

	public static void main(String[] args) {
		String str = "Welcome to Testyantra";
		String[] s = str.split(" ");
		for(int i =0;i<s.length;i++)
		{
			String str1 = s[i];
			
			for(int j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
