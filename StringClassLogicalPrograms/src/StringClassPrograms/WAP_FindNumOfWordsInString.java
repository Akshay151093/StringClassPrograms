package StringClassPrograms;

public class WAP_FindNumOfWordsInString {
	public static void main(String[] args) {
		String str = "A soft assertion continues with the";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count = count + 1;
			}
		}

		System.out.println("No of Words : " + count);
	}
}
