package Pr;

public class Prashant {

	public static void main(String[] args) {
		String s = "my name is tom";
		String[] str = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}
