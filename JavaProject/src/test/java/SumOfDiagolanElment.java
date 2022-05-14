
public class SumOfDiagolanElment {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{4,8,9}};
		int Dsum1=0;
		int Dsum2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					Dsum1=Dsum1+a[i][j];
				}
				if((i+j)==(a.length-1))
				{
					Dsum2=Dsum2+a[i][j];
				}
			}
		} 
		System.out.println(Dsum1);
		System.out.println(Dsum2);

	}

}
