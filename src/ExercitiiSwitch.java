import java.util.Scanner;

public class ExercitiiSwitch {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Alegeti o zi (introduceti numarul)");
		System.out.print("0. Duminica " + "\n"
		               + "1. Luni" + "\n"
		               + "2. Marti" + "\n"
		               + "3. Miercuri" + "\n"
		               + "4. Joi" + "\n"
		               + "5. Vineri" + "\n"
		               + "6. Sambata" + "\n"
		               );
		int alegere = keyboard.nextInt();
		 
		switch(alegere) {
		 
		   case 0: System.out.println("Azi e zi libera");
		           break;
		    
		   case 1: System.out.println("Azi e prima zi de munca");
		           break;
		    
		   case 2: System.out.println("Azi sunt trei ceasuri rele. Not!");
		           break;
		    
		   case 3: System.out.println("Azi e mijlocul saptamanii");
		           break;
		    
		   case 4: System.out.println("Incepe sa se simta adierea vacantei");
		           break;
		    
		   case 5: System.out.println("Ultima zi de munca. Ura!");
		           break;
		    
		   case 6: System.out.println("Sambata!!!");
		           break;
		 
		   default: System.out.println("N-ai ales o zi a saptamanii!");
		}
		
		
		System.out.println("Alegeti o zi (introduceti numele)");
		String zi = keyboard.next();
		switch(zi) {
		case "Luni":
			System.out.println("este prima zi din saptamana");
			break;
		case "Marti":
			System.out.println("este a2a zi din saptamana");
			break;
		case "Miercuri":
			System.out.println("este a3a zi din saptamana");
			break;
		case "Joi":
			System.out.println("este a4a zi din saptamana");
			break;
		default: System.out.println("nu este un nume de zi valabil");
		
		
		}
		

	}

}
