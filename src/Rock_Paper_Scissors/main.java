package Rock_Paper_Scissors;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean play = true;
		
		System.out.println("=========================================");
		System.out.println("========== Rock-Paper-Scissors ==========");
		System.out.println("=========================================");
		
		Rock_Paper_Scissors rps = new Rock_Paper_Scissors();
		
		while(play) {
			System.out.println("Enter Rock or Paper or Scissors: ");
			String userChoice = input.next();
			userChoice = userChoice.toLowerCase();
			
			while(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
				System.out.println("Invalid choice. Please Enter again: ");
				userChoice = input.next().toLowerCase();
			}
			
			rps.game(userChoice);
			
			String playAgain = " ";
			while(true) {
				System.out.println("Do you want to play again? (Yes/No)");
				playAgain = input.next();
				if(playAgain.equals("Yes") || playAgain.equals("yes")) {
					play = true;
					break;
				}
				else {
					if(playAgain.equals("No") || playAgain.equals("no")) {
						play = false;
						rps.finalWin();
						break;
					}
					else {
						System.out.println("Invalid input. Try again");
					}
				}
			}
			
		}//end while loop

	}//end main

}//end class main
