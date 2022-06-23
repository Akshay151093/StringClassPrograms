package StringClassPrograms;

public class WAP_ConvertStringToInt {
	public static void main(String[] args) {
		String str1="1245";
		String str2="1000";

		//Approach 1
		Integer i=Integer.valueOf(str1);
		System.out.println("Value After Converted "+i);

		//Approach2
		int j=Integer.parseInt(str2);
		System.out.println("Value After Converted "+j);

	}
}
