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

	public void 
	    
	

