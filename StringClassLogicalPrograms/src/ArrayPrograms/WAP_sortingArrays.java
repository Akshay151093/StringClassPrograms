package ArrayPrograms;

public class WAP_sortingArrays {
	public static void main(String[] args) {
		int []a= {12,6,14,1,36,4,56,8,97};
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
