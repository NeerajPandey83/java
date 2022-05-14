
public class FirstAndSecondMin {

	public static void main(String[] args) {
			
			int a[] = {2, 5, 50, 1, 60, 55, 0};
			int fMin = a.length;
			int sMin = a.length;
			
			
			for(int i=0; i<a.length; i++)
			{
				if(fMin>a[i])
				{
					sMin = fMin;
					fMin = a[i];
				}
				
				else if(sMin>a[i])
				{
					sMin=a[i];
				}
			}		
			System.out.println(fMin+" "+sMin);

	}

}
