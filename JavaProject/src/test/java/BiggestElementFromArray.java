
public class BiggestElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,29,48,50,21,11};
		int big =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);

	}

}
