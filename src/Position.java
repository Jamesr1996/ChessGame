// Class for the individual spaces on the board containing both black and white.
// Holds a Piece object and returns the type attribute from the corresponding piece.

public class Position {
	private String colour; 
	public Piece Piece = null;
	
	// Default constructor for board construction.
	public Position(String colour){
		this.colour = colour;
	}
	
	// Set a piece on a position.
	public void updatePosition(Piece piece){
		this.Piece = piece;
	}
	
	// Return the Type of the Piece on the Position
	// If no piece is found, return a '.'
	public char returnPieceType(){
		if (this.Piece == null){
			return '.';
		} else {
			return this.Piece.type;
		}
	}
	
	// Returns the colour of the Position.
	public String returnPositionColour(){
		return this.colour;
	}
	
	// Returns the colour of the Piece on the Corresponding Position
	public String returnPieceColour(){
		if (this.Piece == null){
			return "";
		} else {
			return this.Piece.colour;
		}
	}
}
