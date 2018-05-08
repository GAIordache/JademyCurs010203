import java.util.Scanner;

public class ExMesaj {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 
        System.out.println("Type in a message, and I'll display it 100 times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
 
        for (int n = 0; n < 100; n++) {
            System.out.println(n + ". " + message );
        }

	}

}
