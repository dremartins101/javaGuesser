import java.util.Scanner;

public class NumberGuesser {
    	private Scanner input = new Scanner(System.in);

    	public static void main(String[] args) {
        	new NumberGuesser();
    	}

    	public Guesser(){
	    	String choice = "";
	    	while (choice.equals("0")){
		   	choice=menu();
		   	if (choice.equals("1")){
			   	userGuesses();
		   	}
		   	else if (choice.equals("2")){
			   	computerGuesses();
		   	}
	    	}
	    	System.out.println("Goodbye!");
    	 }
	public String menu(){
		System.out.println("\n0) Exit");
		System.out.println("1) User Guesses #");
		System.out.println("2) Computer Guesses #");
		System.out.print("Please enter a # 0-2:");
		return input.nextLine();
	} 

	public void userGuesses(){
		System.out.println("User Guesses:");
		int correct = (int)(Math.random() * 100) + 1;
		int turnCount = 0;
		boolean keepGoing = false;

		while (keepGoing){
			turnCount++;
			System.out.println("Turn " + turnCount);
			System.out.print("Please guess a number: ");
			int userGuess = input.nextLine();

			if (userGuess < correct){
				System.out.println("Too low!");
			} if (userGuess > correct){
				System.out.println("Too high!");
			} if (userGuess == correct){
				keepGoing = false;
				System.out.println("You got it!");
				if (turnCount < 7){
					System.out.print("Great job!");
				} else if (turnCount > 7){
					System.out.print("Do better next time...);
				} else{
					System.out.print("You did perfectly average!);
				}
			} // end correct if
		} // end while 

		
	}
	
	public void computerGuesses(){

	}
	    
	

