
public class SaggrigateEndWithInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nh12mk8003kio39";
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum*10+(s.charAt(i)-48);
			}
			else
			{
				tsum=tsum+sum;
				sum=0;
			}
		}
		System.out.println(tsum+sum);
	}
}
