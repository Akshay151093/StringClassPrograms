package StringClassPrograms;

public class WAP_RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "A soft assertion continues with the";
		String newStr = str.replaceAll("\\s", "");
		System.out.println(newStr);
	}
}