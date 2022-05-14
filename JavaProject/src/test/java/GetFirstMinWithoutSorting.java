
public class GetFirstMinWithoutSorting {

	public static void main(String[] args) {
        int a[] = {30, 60, 20, 40, 50};
		
		int min =a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println("Minimum number in array is "+min);

	}

}
