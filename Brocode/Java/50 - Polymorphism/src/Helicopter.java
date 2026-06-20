
public class Helicopter extends ArialVehicle {

	@Override
	void go() {
		System.out.println("""
				*A helicopter takes off, rotors sweeping like crazy 🚁*""");
	}
	
	@Override
	void stop() {
		System.out.println("""
				*The helicopter lands on a helipad 🚁 -> |H| *""");
	}
	
	@Override
	void board() {
		System.out.println("");
	}
	
	void blackHawkDown() {
		System.out.println("""
				Mayday mayday, RPG shot down this heli :(""");
	}
}
