package Pr;

public class NumberPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =1;
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println(" ");
		}
		
		
		
		boolean flag =true;
		int j=1;
		int count=1;
		int count1=0;
		
		while(flag)
		{
			for (int i =j; i <=10; i++) 
			{
			   System.out.print(i+" ");
			   if(i==10)
			   {
				   flag=false;
			   }
			   
			   count1++;
			   if(count==count1)
			   {
				   System.out.println();
				   
				   j=i+1;
				   count1=0;
				   count++;
				   break;
			   }
			}
		}
		
		
		

	}

}
