import java.util.Random;

public class DoWhile {

	public static void main(String[] args) {
		Random rand = new Random();
		int zar1;
		int zar2;
		
		do {
			zar1= rand.nextInt(6)+1;
			zar2= rand.nextInt(6)+1;
			
			System.out.println(zar1 + " cu " + zar2);
		} while (zar1 != zar2);

	}

}
