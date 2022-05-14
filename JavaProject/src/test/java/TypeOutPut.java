
public class TypeOutPut {

	public static void main(String[] args) {
		// Both having same elements
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		int count =a.length;
		
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0; i<count;i++)
		{
			System.out.println(a[i]+b[i]);
		}

	}

}
