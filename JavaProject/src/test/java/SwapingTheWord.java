
public class SwapingTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Testyantra";
		String[] s =str.split(" ");
		String temp =s[0];
		
		s[0] = s[s.length-1];
		
		s[s.length-1]=temp;
		
		System.out.println(temp);
		System.out.println(s[0]);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
