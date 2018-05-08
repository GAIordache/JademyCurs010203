import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Ce numar vrei?");
		int numar = sc.nextInt();
		System.out.println("Ai ales numarul: " + numar);
	}

}
