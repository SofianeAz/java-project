import java.util.Scanner;

public class BankTerminal {

		// Fonction de terminal de banque
		public static void main(String[] args) {
			String loggedIn;
			loggedIn = "false";
			String accountName = "0";
			Scanner scannerInit = new Scanner(System.in);
			System.out.println("Welcome, please enter your account name !");
			do {
				System.out.println();
				accountName = scannerInit.next();
				
				System.out.println();
				
					switch(accountName) {
						case "Jack":
							Account JackRyan = new Account("JackRyan", "A00001");
							loggedIn = "true";
							JackRyan.showMenu();		
							break;
							
						case "Lina":
							Account LinaInverse = new Account("LinaInverse", "B00001");
							loggedIn = "true";
							LinaInverse.showMenu();							
							break;
							
						default:
							System.out.println("Error: this account doesn't exist.");
							break;
					}

				} while(loggedIn != "true");
				scannerInit.close();
				System.out.println("Logging Out");
			}	
		
}