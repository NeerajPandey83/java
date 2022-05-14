
public class PrintSpcChrctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="ab!@#mjn%&hg*jg#m";
		
		//String spc =" ";
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				
			}
			else
			{
				//spc=spc+s.charAt(i);
				System.out.print(s.charAt(i));
			}
			
		}
	     // System.out.println(spc);
	}

}
