package IncrementDecrement;


public class ÄnderungDurchführen {

	public static void main(String[] args) {
			int total = 248;
			int fiftyEuroNotes = total / 50;
			int modulus = total % 50;
			int tenEuroNotes = modulus / 10; modulus = modulus % 10;
			int fiveCents = modulus / 5; modulus = modulus % 5;
			int left = modulus;
			
			System.out.println("From " + total + " euro du bekommst"); 
			System.out.printf("%d fifty euro notes %n", fiftyEuroNotes); 
			System.out.println(tenEuroNotes + " ten euro notes"); 
			System.out.println(fiveCents + " five cent coins"); 
			System.out.println(left + " cent");

	}

}
