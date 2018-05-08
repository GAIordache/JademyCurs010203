import java.util.Random;
import java.util.Scanner;

public class ExercitiiIf {

	public static void main(String[] args) {
		
		Scanner mSc = new Scanner(System.in);
		System.out.println("Ce varsta aveti?");
		int varsta = mSc.nextInt();
		String txt = checkAge(varsta);
		System.out.println(txt);
		
		System.out.println("a cata zi din saptamana este azi?");
		int zi = mSc.nextInt();
		ziSaptamana(zi);
		


	}
	
	public static void ziSaptamana(int pDay) {
		if (pDay == 1) {
            System.out.println("Luni");
        } else if (pDay == 2) {
            System.out.println("Marti");
        } else if (pDay == 3) {
            System.out.println("Miercuri");
        } else if (pDay == 4) {
            System.out.println("Joi");
        } else if (pDay == 5) {
            System.out.println("Vineri");
        } else if (pDay == 6) {
            System.out.println("Sambata");
        } else if (pDay == 7) {
            System.out.println("Duminica");
        } else {
            System.out.println("Nicio zi de care trebuie");
        }
	}
	
	public static String checkAge(int pAge) {
		String text;
		if (pAge >= 18) {
			text = "Este Adult";
		}else {
			text = "Este Minor";
		}
		return text;
		
	}
}
