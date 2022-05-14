package Pr;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "am neeraj pandey";
		String [] str = s.split(" ");
		for (int i = str.length-1; i >=0; i--)
		{
			
			System.out.print(str[i]+" ");
			
			//System.out.print(str[i]);
		}
	}

}
