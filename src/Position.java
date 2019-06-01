public class Position {
	private String colour; 
	public Piece Piece = null;
	
	// Convenience constructor for Piece configuration.
	public Position(char type){
		this.Piece = new Piece(type);
	}
	
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
}
