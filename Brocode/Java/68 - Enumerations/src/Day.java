
public enum Day {
	
	// These call the constructor with these constants
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
	THURSDAY(5), FRIDAY(6), SATURDAY(7),
	SPONGEBOBDAY(8);
	
	private final int dayNumber;
	
	// This constructor sets the dayNumber field
	Day(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	
	// Accessor for the dayNumber
	public int getDayNumber() {
		return this.dayNumber;
	}
}
