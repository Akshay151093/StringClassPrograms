package StringClassPrograms;

import java.util.HashMap;
import java.util.Map;

public class WAP_CountEachChar {
	public static void main(String[] args) {
		String str="tocontribute@geeksforgeeksorg";

		Map <Character,Integer> map=new HashMap<Character, Integer>();
		
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
		
		System.out.println(map);
	}
}
