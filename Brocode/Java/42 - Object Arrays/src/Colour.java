
public enum Colour {
	RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, 
	WHITE, GRAY, GREY, BLACK;
	
	// Since I knew enums in java act a little more like objects,
	// I found out that you can have your own custom methods for
	// enummerations in java!!! :0 wow!
	public static String getColourStr(Colour colour) {
		switch (colour) {
			case RED: 		return "red";
			case ORANGE: 	return "orange";
			case YELLOW: 	return "yellow";
			case GREEN: 	return "green";
			case BLUE: 		return "blue";
			case PURPLE: 	return "purple";
			case WHITE:		return "white";
			case GRAY:		
			case GREY: 		return "grey";
			case BLACK:		return "black";
			default: 		return "unknown";
		}
	}
}
