package StringClassPrograms;

public class WAP_RemoveSpecialChar {
	public static void main(String[] args) {
		String str="nu4548$&bu%32Hikjm16(*77%";
		String s1=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
}
