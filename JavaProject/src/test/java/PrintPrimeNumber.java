
public class PrintPrimeNumber {

	public static void main(String[] args) {
		int no = 17;
		boolean flag = true;
		
//		if(no<=1)
//		{
//			flag=false;
//		}
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it's a prime number");
		}
		else
		{
			System.out.println("it's not prime number");
		}

	}

}
