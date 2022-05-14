package Pr;

import java.util.Iterator;

public class Incremental123112233111222333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		String nums ="";
		
		while(num>0)
		{
			int i =num%10;
			nums = i+nums;
			num =num/10;
		}
		
		boolean flag= true;
		int count0 =1;
		while(flag)
		{
			for(int i=0;i<nums.length();i++)
			{
				
				int count = count0;
				while(count>0)
				{
					System.out.print(nums.charAt(i));
					count--;
				}
				
			}
			if(count0==3)
			{
				flag=false;
			}
			count0++;
			System.out.println();
		}

	}

}
