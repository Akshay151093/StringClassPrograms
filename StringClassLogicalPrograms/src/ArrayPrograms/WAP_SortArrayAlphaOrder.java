package ArrayPrograms;

public class WAP_SortArrayAlphaOrder {

	public static void main(String[] args) {
		String []str= {"a","q","w","e"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				String temp="";
				if(str[i].compareTo(str[j])<0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
			System.out.println(str[i]);
		}

	}

}
