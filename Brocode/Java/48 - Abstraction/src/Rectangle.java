
public class Rectangle extends Shape{
	int length;
	int height;
	
	Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	@Override
	double area() {
		return this.length * this.height;
	}
}
