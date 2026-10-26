import java.util.*;

public class Hello {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String userName = input.nextLine();
		System.out.println("Nice to meet you, " + userName);
	} // end hello
} // end class def
