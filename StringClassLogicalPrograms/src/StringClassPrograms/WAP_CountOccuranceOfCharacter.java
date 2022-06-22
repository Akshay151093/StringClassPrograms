package StringClassPrograms;

public class WAP_CountOccuranceOfCharacter {
	public static void main(String[] args) {
		String str = "akshay thorat is software test engineer";
		int originalL = str.length();
		int newL = (str.replace("i", "")).length();

		System.out.println("Ocuurance of a in given String " + (originalL - newL));

	}
}
