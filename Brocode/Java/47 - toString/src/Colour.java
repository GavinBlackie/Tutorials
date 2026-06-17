
public enum Colour {
	RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE,
	WHITE, GREY, BLACK;
	
	static String getColourStr(Colour colour) {
		switch (colour) {
			case RED:		return "red";
			case ORANGE: 	return "orange";
			case YELLOW: 	return "yellow";
			case GREEN: 	return "green";
			case BLUE: 		return "blue";
			case PURPLE: 	return "purple";
			case WHITE: 	return "white";
			case GREY: 		return "grey";
			case BLACK: 	return "black";
			default:  		return "unknown colour";
		}
	}
}
