
public class ReverseAStringWithoutArray {

	public static void main(String[] args) {
		// Reverse string without length method from array or string
				String str ="Jagdeeshan";
				
				/*StringBuffer sb = new StringBuffer(s);
				System.out.println(sb.reverse());*/
				
				char[] s= str.toCharArray();
				int count = 0;
				for(char c : s )
				{
					count++;
				}
				
				for(int i=count-1; i>=0; i--)
				{
					System.out.print(str.charAt(i));
				}
		
	}

}
