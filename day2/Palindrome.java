package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
        int input = 12321; 
        int output = 0;   
        int originalInput = input;
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;
            output = output * 10 + rem;
        }
        if (originalInput == output) {
            System.out.println(originalInput + " is a palindrome.");
        } 
        else {
            System.out.println(originalInput + " is not a palindrome.");
        }
    }
}