
public class FiboNumber {

	public static void main(String[] args) {
		int fib1 =0;
		int fib2 =1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=0;i<10;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			
			if(fib3>=10)
			{
				break;
			}
			else
			{
				System.out.print(fib3+" ");//print fibnocci no.till 10
			}
		}
	}

}
