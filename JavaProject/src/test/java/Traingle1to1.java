
public class Traingle1to1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=sp;j++)
			{
				System.out.print("  ");
			}
			
			int k =1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k+" ");
			
			if(j<=st/2)
			
				k++;
			
			else
			
				k--;
			

        }
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
    }
}
}
