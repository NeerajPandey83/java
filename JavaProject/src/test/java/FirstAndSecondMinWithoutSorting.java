
public class FirstAndSecondMinWithoutSorting {

	public static void main(String[] args) {
		int a[]= {0,3,4,6,9,1,4,2,1};
		int fmin=0;
		int smin=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(fmin==smin ||smin>a[i])
			{
				smin=a[i];
			}
		}
		System.out.println("Fist minimum no is"+"= "+fmin);
		System.out.println("Second min no is "+"= "+smin);

	}

}
