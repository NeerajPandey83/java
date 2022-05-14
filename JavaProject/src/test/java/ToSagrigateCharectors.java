import java.util.Scanner;

public class ToSagrigateCharectors {

	public static void main(String[] args) {
		//String s = "ab345nd@#907$Ab%$vf*^98&Sv!";
		
	Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String alp = " ";
		String num =" ";
		String spcl =" ";
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z' || s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				alp = alp+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num+(s.charAt(i)-48);
			}
			else 
			{
				spcl = spcl+s.charAt(i);
			}
			
		}
		System.out.println(alp+num+spcl);
	}
	
}
