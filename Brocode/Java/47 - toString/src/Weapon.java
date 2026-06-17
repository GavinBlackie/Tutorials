
public class Weapon {
	String name;
	String modifier;
	
	Weapon (String name) {
		this.name = name;
	}
	
	Weapon(String name, String modifier) {
		this.name = name;
		this.modifier = modifier;
	}
	
	@Override
	public String toString() {
		if (this.modifier == null) {
			return this.name;
		}
		return this.modifier + " " + this.name;
	}
}
