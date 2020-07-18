import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Was heissen Sie? ");
		//was heissen Sie?
		
		String name = scan.next(); //wir erstellen eine Box/Kasten fuer Benutzername
		
		System.out.printf("name %s", name); //die variable ist jetzt auf unserem Bildschirm
		

	}

}
