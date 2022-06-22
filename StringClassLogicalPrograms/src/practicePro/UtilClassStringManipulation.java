package practicePro;

public class UtilClassStringManipulation {
	public void reverseString(String str) 
	{
		System.out.println("Original String : "+str);
		String s1=new String ();
		for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);	
		}
		System.out.println("Reversed String : "+s1);
	}
	
	public void occurenceOfCharacter(String str,String a) 
	{
		String s1=str.replaceAll("a", "");
		int count=str.length()-s1.length();
		System.out.println("Ocuurence of "+a+" in '"+str+"' is "+count);
	}
	
	public void countOfWords(String str)
	{
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count=count+1;
			}
		}
		System.out.println("Count of words in '"+str+"' is "+count);
	}
	
	public void reverseEachWord(String str)
	{
		//akshay jayhind thorat
		
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			String s1=new String();
			if(str.charAt(i)==' ')
			{
				for(int j=str.length()-1;j>i;j--)
				{
					s1=s1+str.charAt(j);
				}
				System.out.println(s1);
			}
		}
	}
	
	public void countOfVowel(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count=count+1;
			}
		}
		System.out.println("Count of Vowel : "+count);
	}
	
}
