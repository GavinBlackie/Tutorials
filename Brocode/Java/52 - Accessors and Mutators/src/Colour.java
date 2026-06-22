
// This is a copy of previous "Colour" code!! :0
public enum Colour {
	RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE,
	WHITE, GREY, BLACK, UNKNOWN;
	
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
	
	static Colour strToColour(String str) {
		switch (str) {
			case "red":		return RED;
			case "orange": 	return ORANGE;
			case "yellow": 	return YELLOW;
			case "green": 	return GREEN;
			case "blue": 	return BLUE;
			case "purple": 	return PURPLE;
			case "WHITE": 	return WHITE;
			case "GREY": 	return GREY;
			case "black": 	return BLACK;
			default:  		throw new IllegalArgumentException("Invalid colour string");
		}
	}
}
