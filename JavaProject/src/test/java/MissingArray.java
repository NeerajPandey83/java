
public class MissingArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,7,8,9,10,11,12,14}; //staring from 1 to------n
		int expect = arr.length+1;
		int totalsum = expect*(expect+1)/2;
		int sum=0;
         for(int i=0;i<arr.length;i++)
         {
        	 sum=sum+arr[i];
         }
         System.out.println(totalsum-sum);
	}
}
