import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int nr2;
		int nr1;
		do {
			nr2 = keyboard.nextInt();
			nr1 = keyboard.nextInt();
			
			System.out.println(nr1 + nr2);
			System.out.println(nr1 * nr2);
			
		} while(nr1 !=0 || nr2 !=0);
		
		
		

	}

}
