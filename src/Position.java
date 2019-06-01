// Class for the individual spaces on the board containing both black and white.
// Holds a Piece object and returns the type attribute from the corresponding piece.

public class Position {
	private String colour; 
	public Piece Piece = null;
	
	// Default constructor for board construction.
	public Position(String colour){
		this.colour = colour;
	}
	
	public void updatePosition(Piece piece){
		this.Piece = piece;
	}
	
	public char returnValue(){
		if (this.Piece == null){
			return '.';
		} else {
			return this.Piece.type;
		}
	}
	
	public String returnColour(){
		return this.colour;
	}
	
	public String returnPieceColours(){
		if (this.Piece == null){
			return "";
		} else {
			return this.Piece.colour;
		}
	}
}
