 
public class FirstAndSecondMax {

	public static void main(String[] args)
	{
		
		int a[] = {65, 30, 50, 60, 55};
		int fMax = 0;
		int sMax = 0;
		
		
		for(int i=0; i<a.length; i++)
		{
			if(fMax<a[i])
			{
				sMax = fMax;
				fMax = a[i];
			}
			
			else if(sMax<a[i])
			{
				sMax=a[i];
			}
		}		
		System.out.println(fMax+" "+sMax);	

		
	}

}
