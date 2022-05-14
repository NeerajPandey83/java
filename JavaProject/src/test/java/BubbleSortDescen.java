
public class BubbleSortDescen {

	public static void main(String[] args) {

		int a[]= {10,20,30,1,2,3};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
						
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
						
				}
			}
			//System.out.print(a[i]+" ");
		}
		
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.print(a[k]+" ");
		}

	}

}
