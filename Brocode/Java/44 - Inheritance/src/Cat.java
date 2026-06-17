
public class Cat extends Animal{

	// "Each child can still have unique attributes"
	int lives = 9;
	
	@Override
	void eat() {
		System.out.println("Meow Meow! A cat is eating!!");
	}
	
	// "Each child can still have unique methods"
	void speak() {
		System.out.println("The cat goes *meow meow*");
	}
}
