package Rock_Paper_Scissors;

public class Rock_Paper_Scissors {
	
	String[] choices = {"rock", "paper", "scissors"};
	int userWins = 0;
	int computerWins = 0;
	
	public void game(String userChoice) {
		String computerChoice = getRandom();
		System.out.println("User Choice: " + userChoice);
		System.out.println("Computer Choice: " + computerChoice);
		if(userChoice.equals(computerChoice)) {
			tie();
		}
		else {
			if(userChoice.equals("rock") && computerChoice.equals("scissors")) {
				userWin();
			}
			else {
				if(userChoice.equals("paper") && computerChoice.equals("rock")) {
					userWin();
				}
				else {
					if(userChoice.equals("scissors") && computerChoice.equals("paper")) {
						userWin();
					}
					else {
						computerWin();
					}
				}
			}
		}
			
	}//end game method
	
	public void userWin() {
		userWins++;
		System.out.println("**** Win ****");
		print();
	}
	
	public void computerWin() {
		computerWins++;
		System.out.println("**** Lose ****");
		print();
	}
	
	public void tie() {
		System.out.println("**** Tie ****");
		print();
	}
	
	public void print() {
		System.out.println("User Wins: " + userWins);
		System.out.println("Computer Wins: " + computerWins);
	}
	
	public void finalWin() {
		if(userWins > computerWins) {
			print();
			System.out.println("************ You Win ************");
		}
		else {
			if(userWins < computerWins) {
				print();
				System.out.println("************ Computer Wins ************");
			}
			else {
				print();
			    System.out.println("************ Tie ************");
			}
		}
	}//end finalWin method
	
	public String getRandom() {
		int num = (int)(Math.random() * choices.length);
		String random = choices[num];
		return random;
	}//end getRandom method

}//end class Rock_Paper_Scissors
