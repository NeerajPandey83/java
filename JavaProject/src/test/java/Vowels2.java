
public class Vowels2 {
public static void main(String[] args)
{
	String s="testyantra";
	int count=0;
	char ch[] =s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		
		
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]);
			}
				}
	     System.out.print("="+count);

     }
}
