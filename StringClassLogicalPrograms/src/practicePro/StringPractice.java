package practicePro;

import java.util.HashMap;
import java.util.Map;

public class StringPractice {
	public static void main(String[] args) {

		String str="akshay thorat";
		String temp="";
		int count1=1;

		//Reverse String
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);

		//Occurence of char
		Map <Character,Integer> map=new HashMap <Character,Integer>();

		char [] chars=str.toCharArray();

		for(char ch : chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}

		System.out.println("Count of each Char : "+map);

		//count of words
		String[] strs=str.split(" ");
		System.out.println("No of words : "+strs.length);

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count1=count1+1;
			}
		}
		System.out.println("No of words : "+count1);

		//Reverse each word in string
		String[] words=str.split(" ");
		String temp2="";
		for(int j=0;j<words.length;j++)
		{
			String wd=words[j];
			for(int i = wd.length()-1;i>=0;i--)
			{
				temp2=temp+wd.charAt(i);	
			}
	
		}
		System.out.println(temp);
		
		//junk characters remove
		String s1="!fhuj%456NAjha JI$%%jbj(87";
		String s2=s1.replaceAll("[^a-zA-Z]","");
		System.out.println(s2);
		
		//Remove white spaces
		System.out.println(str.replaceAll(" ", ""));


		String ss="Sachin Ramesh Tendulkar";
		String temp5="";
		String [] ss1=ss.split(" ");
		for(int i=ss1.length-1;i>=0;i--)
		{
			temp5=temp5+ss1[i]+" ";
			
		}
		System.out.print(temp5);












	}
}
