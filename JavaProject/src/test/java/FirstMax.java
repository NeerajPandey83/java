
public class FirstMax {

	public static void main(String[] args) {
       int a[] = {12, 16, 11, 18, 9};
		
		int max =a[0];
		for(int i=0; i>a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
				
		}
		
		System.out.println("Maximum number in an array is "+max);

	}

}
