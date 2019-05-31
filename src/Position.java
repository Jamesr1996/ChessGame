public class Position {
	private String colour; 
	private char type;
	
	// Convenience constructor for Piece configuration.
	public Position(char type){
		this.type = type;
	}
	
	// Default constructor for board construction.
	public Position(String colour){
		
	}
	
	public void updatePosition(){
		
	}
	
	public char returnValue(){
		return this.type;
	}
	
	public String returnColour(){
		return this.colour;
	}
	
}
