import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String s ="wow";
		String rev ="";
		for(int i =s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
