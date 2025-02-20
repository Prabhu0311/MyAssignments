package week3.assignment;

public class Reverse {
    public static void main(String[] args) {
        String test = "I am a software tester";
        
        String[] words = test.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { 
                String reversedWord = reverseString(words[i]);
                result.append(reversedWord).append(" ");
            } 
            else {
                
                result.append(words[i]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }

    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}