
public class SplitWordWrtSpace {

	public static void main(String[] args) {
		String str ="Welcome to Testyantra";
		String[] s = str.split(" ");
		for(int i =s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" "); //Testyantra to Welcome
			//System.out.print(s[i]); // TestyantratoWelcome
		}
	}
}
