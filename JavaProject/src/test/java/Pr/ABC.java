package Pr;

public class ABC {

	public static void main(String[] args) 
	{
		String s ="this is neeraj";
		String[] sp = s.split(" ");
		
		for (int i = 1; i < sp.length-1; i++) 
		{
			String ss =sp[i];
			String rev ="";
			
			for (int j = 0; j < ss.length(); j++) 
			{
				rev = ss.charAt(j)+rev;
				
			}
			sp[i]=rev;
			
		}
		for (int i = sp.length-1;i>=0; i--) 
		{
			System.out.print(sp[i]+" ");
			
		}
		

	}

}
