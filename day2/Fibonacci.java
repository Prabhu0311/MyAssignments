package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
        int n = 8; 
        int a = 0; 
        int b = 1; 

        //System.out.println("Fibonacci Series up to " + n + " terms:");

        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int sum = a + b; 
            a = b; 
            b = sum; 
        }
    }
}