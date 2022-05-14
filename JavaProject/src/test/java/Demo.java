
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		int temp = a[0];
		a[0]=a[a.length-2];
		a[a.length-2]=temp;
//		for(int i=0;i<a.length;i++)
//		{
//			//System.out.print(a[i]);
//			
//		}
		int temp1=a[1];
		a[1]=a[a.length-1];
		a[a.length-1]=temp1;
		for(int j=0;j<a.length;j++)
		{
			//System.out.print(a[j]);
		}
		
	}

}
