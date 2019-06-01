// Sets up the board by creating individual Pieces at their corresponding co-ordinates 
// from a 2D array of Positions used to contain them.

public class ChessBoard {
	
	// Can change these in constructor for larger games in future projects
	int boardWidth = 8;
	int boardHeight = 8;
	
	public Position[][] board = new Position[boardWidth][boardHeight];
	
	public ChessBoard(){
		setUp8x8Chess();
	}
	
	// Initial configuration of pieces on board
	public void setUp8x8Chess(){
		
		// Set up black and white spaces
		int count = 0;
		for (int a = 0; a < boardHeight; a++){
			for (int b = 0; b < boardHeight; b++){
				if (count % 2 == 0){
					board[a][b] = new Position("White");
				} else {
					board[a][b] = new Position("Black");
				}
				
				// Set up piece positions
				if (a == 0 && (b == 0 || b == 7)){
					board[a][b].updatePosition(new Piece('R', "Black"));
				}
				if (a == 7 && (b == 0 || b == 7)){
					board[a][b].updatePosition(new Piece('R', "White"));
				}
				
				if (a == 0 && (b == 1 || b == 6)) {
					board[a][b].updatePosition(new Piece('B', "Black"));
				}
				if (a == 7 && (b == 1 || b == 6)){
					board[a][b].updatePosition(new Piece('B', "White"));
				}
				
				if (a == 0 && (b == 2 || b == 5)){
					board[a][b].updatePosition(new Piece('H', "Black"));
				}
				if (a == 7 && (b == 2 || b == 5)){
					board[a][b].updatePosition(new Piece('H', "White"));
				}
				
				if (a == 0 && b == 3){
					board[a][b].updatePosition(new Piece('Q', "Black"));
				}
				if (a == 7 && b == 3){
					board[a][b].updatePosition(new Piece('Q', "White"));
				}
				
				if (a == 0 && b == 4){
					board[a][b].updatePosition(new Piece('K', "Black"));
				}
				if (a == 7 && b == 4){
					board[a][b].updatePosition(new Piece('K', "White"));
				}
				
				if (a == 1){
					board[a][b].updatePosition(new Piece('P', "Black"));
				}
				if (a == 6){
					board[a][b].updatePosition(new Piece('P', "White"));
				}				
				// Move onto the next colour
				count++;
			}
			// Next Space should be the same colour as the last so we increment count
			count++;
		}
	}
	
	
	void checkMove(){
		
	}
	
	// Show Board State
	void displayBoard(){
		for (int i = 0; i < boardHeight; i++){
			for (int x = 0; x < boardWidth; x++){
				// Print Line
				System.out.print(board[i][x].returnValue()+ " ");
			}
			// Move down a line
			System.out.println();
		}
	}
	
}
