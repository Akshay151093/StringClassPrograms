package StringClassPrograms;

public class WAP_ReverseString {

	public static void main(String[] args) {
		String str = "AKSHAY";
		System.out.println("Original String : " + str);

		// Approach 1
		String temp = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		System.out.println("Reversed String : " + temp);
	}
}
