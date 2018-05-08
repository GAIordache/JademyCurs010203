import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		
		Scanner mKeyboard = new Scanner(System.in); 
		int mSumaElemente = 0;
		int[] mArr = new int[10]; 
		
		for (int i=0; i<mArr.length; i++) {
			System.out.println("se citeste elementul " + i + " din sir");
			mArr[i] = mKeyboard.nextInt();
			mSumaElemente += mArr[i];
		}
		System.out.println(mSumaElemente);
		
		System.out.println("Da-ti nr de numere: ");
		int n = mKeyboard.nextInt();
		int[] mArr1 = new int[n];
		
		
		for (int i=0; i< mArr1.length; i++ ) {
			mArr1[i] = (int) (Math.random() * 100);
		}
		
		int nrMin = mArr1[0];
		int nrMax = mArr1[0];
		long produs = 1L;
		int contorNr = 0;
		int sumaEl = 0;
		
		for (int nr : mArr1) {
			System.out.println(contorNr++ + ". " + nr);
			
			if (nr< nrMin ) nrMin = nr;
			if (nr> nrMax ) nrMax =nr;
			if (nr>0) produs *= nr;
			sumaEl += nr;
			
			
		}
		
		System.out.println("min " + nrMin);
		System.out.println("max " + nrMax);
		System.out.println("produs " + produs);
		System.out.println("media " + sumaEl/mArr1.length);

	}

}


