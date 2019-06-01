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
				if (a == 0 && (b == 0 || b == 7) || a == 7 && (b == 0 || b == 7)){
					board[a][b].updatePosition(new Piece('R'));
				} 
				if (a == 0 && (b == 1 || b == 6) || a == 7 && (b == 1 || b == 6)) {
					board[a][b].updatePosition(new Piece('B'));
				}
				if (a == 0 && (b == 2 || b == 5) || a == 7 && (b == 2 || b == 5)){
					board[a][b].updatePosition(new Piece('H'));
				}
				if ((a == 0 && b == 3) || (a == 7 && b == 3)){
					board[a][b].updatePosition(new Piece('K'));
				}
				if ((a == 0 && b == 4) || (a == 7 && b == 4)){
					board[a][b].updatePosition(new Piece('Q'));
				}
				for (int p = 0; p < 8; p++) {
					if (a == 1 || a == 6){
						board[a][p].updatePosition(new Piece('P'));
					}
				}
	
				// Next Space should be the same colour as the last so we increment count
				count++;
			}
			count++;
		}
		
		
		// Set up piece positions.
//		for (int i = 0; i < boardHeight; i++){
	//		for (int j = 0; j < boardWidth; j++){
		//		board[i][j] = new Position('.');
			//	}
	//		}		
	//	board[0][0] = board[0][7] = board[7][0] = board[7][7] = new Position('R');
	//	board[0][1] = board[0][6] = board[7][1] = board[7][6] = new Position('B');
	//	board[0][2] = board[0][5] = board[7][2] = board[7][5] = new Position('H');
	//	board[0][3] = board[7][3] = new Position('K');
	//	board[0][4] = board[7][4] = new Position('Q');
		
		
		// Implement Colour = Queen Goes on her colour.
		 
		 
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
