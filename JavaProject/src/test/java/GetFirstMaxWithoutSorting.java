
public class GetFirstMaxWithoutSorting {

	public static void main(String[] args) {
        int a[] = {30, 60, 20, 40, 50};
		
		int max =a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum number in array is "+max);

	}

}
