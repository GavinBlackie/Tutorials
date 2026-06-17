
public class MeleeWeapon extends Weapon{
	int strike, thrust;
	MeleeWeapon(String name, int strike, int thrust) {
		super(name);
		this.strike = strike;
		this.thrust = thrust;
	}
	
	@Override
	public String toString() {
		return super.toString() + " with " 
				+ this.strike + " strike, and "
				+ this.thrust + " thrust damage. ";
	}
}
