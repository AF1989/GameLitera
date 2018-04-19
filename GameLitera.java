import java.util.Scanner;

public class GameLitera {

	public static void main(String[] args) {
		String zaglit = "b";
		String litera;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Введіть літеру: ");
			litera = scan.next();
			
		} while (litera.equalsIgnoreCase(zaglit)!=true);
		System.out.println("Right");

	}

}
