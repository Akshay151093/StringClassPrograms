package practicePro;

public class PracticeZAPA {
	public static void main(String[] args) {

		int []a= {1,4,9,8,66,4,55};
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) 
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
