package week3.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if (text1.length() == text2.length()) {
			char[] str1 = text1.toCharArray();
			char[] str2 = text2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			if (Arrays.equals(str1, str2)) {
	            System.out.println("The given strings are Anagram.");
	        } 
			else {
	            System.out.println("The given strings are not an Anagram.");
	        }
				
			
			}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}
}

