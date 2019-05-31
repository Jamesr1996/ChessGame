public class ChessBoard {
	
	public char[][] board = new char[8][8];
	
	public ChessBoard(){
		setUpBoard();
	}
	
	// Initial configuration of pieces on board
	public void setUpBoard(){
		
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				board[i][j] = '.';
			}
		}
		
		board[0][0] = board[0][7] = board[7][0] = board[7][7] = 'R';
		board[0][1] = board[0][6] = board[7][1] = board[7][6] ='B';
		board[0][2] = board[0][5] = board[7][2] = board[7][5] = 'H';
		board[0][3] = board[7][3] = 'K';
		board[0][4] = board[7][4] ='Q';
		
		// Set Pawns
		for (int p = 0; p < 8; p++){
			board[1][p] = board[6][p] = 'P';
		}
		
		// Implement Colour = Queen Goes on her colour.
	}
	
	
	void checkMove(){
		
	}
	
	// Show Board State
	void displayBoard(){
		
		for (int i = 0; i < 8; i++){
			
			for (int x = 0; x < 8; x++){
				// Print Line
				System.out.print(board[i][x] + " ");
			}
			// Move down a line
			System.out.println();
		}
	}
	
}
