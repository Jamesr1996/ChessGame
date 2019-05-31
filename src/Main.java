import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Player 1 name: ");
		Player player1 = new Player(in.nextLine(), "White");
		
		System.out.println("Enter Player 2 name: ");
		Player player2 = new Player("Enter Player 2 name: ", "Black");
		
		// Can add option to change character colours using player.setColour("White/Black");
		System.out.println("Who wants to start?: ");
		
		ChessBoard board = new ChessBoard();
		
		board.displayBoard();

	}

}
