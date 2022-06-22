package StringClassPrograms;

public class WAP_SwapTwoWordsInString {

	public static void main(String[] args) {
		String str = "akshay thorat";
		String temp1 = new String();
		String temp2 = new String();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {

				for (int j = i + 1; j <= (str.length() - 1); j++) {

					temp1 = temp1 + str.charAt(j);

				}
				System.out.print(temp1);
				for (int k = 0; k <= i; k++) {
					temp2 = temp2 + str.charAt(k);
				}
				System.out.println(" " + temp2);
			}
		}

	}

}
