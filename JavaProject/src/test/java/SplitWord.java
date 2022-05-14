
public class SplitWord {

	public static void main(String[] args) {
		String str ="Welcome to Testyantra";
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]); //WelcometoTestyantra
			
		}
	}
}
