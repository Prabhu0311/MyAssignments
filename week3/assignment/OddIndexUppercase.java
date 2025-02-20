package week3.assignment;

public class OddIndexUppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] str = test.toCharArray();
		
		for (int i=0;i<str.length;i++) {
			if (i%2!=0) {
				System.out.print(Character.toUpperCase(str[i]));
			}
			else {
				System.out.print(str[i]);
			}
			
			
		}

	}

}
