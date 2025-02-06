package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int primeNumber=7;
		for (int i=2;i<primeNumber;i++) {
			if(primeNumber%i == 0) {
				System.out.println(+primeNumber+ "is not a prime number");
				return;
			}
		
		}
				System.out.println(+primeNumber+ "is a prime number");
			
		}

	}



