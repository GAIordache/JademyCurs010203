import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		String nume;
		int varsta;
		int numarCopii;
		String masina;
		double salariu;
		
		System.out.print("Cum te cheama?");
		nume = sc.next();
		System.out.print("Cati ani ai?");
		varsta = sc.nextInt();
		System.out.print("Cati copii ai?");
		numarCopii = sc.nextInt();
		System.out.print("Ce masina ai?");
		masina = sc.next();
		System.out.print("Ce salariu ai?");
		salariu = sc.nextDouble();
		
		System.out.println(nume);
		System.out.println(varsta);
		System.out.println(numarCopii);
		System.out.println(masina);
		System.out.println(salariu);
	
		         
		System.out.println("Introduceti un sir de caractere");
		String sir = sc.next();
		         
		int index = sir.indexOf('a');
		System.out.println("Indexul lui 'a' este " + index);
		         
		  
	

	}

}
