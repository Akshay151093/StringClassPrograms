package StringClassPrograms;

public class WAP_LengthOfString {
	public static void main(String[] args) {
		String str="AkshayThorat";
		char [] ch=str.toCharArray();
		int i=0;
		for(char cchh : ch)
		{
			i=i+1;
		}
		System.out.println("Length of String : "+i);
	}
}
