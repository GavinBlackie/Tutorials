#include <iostream> // cout, cin, cerr, clog

// Instructions:
// Calculate area of a rectangle.
// • Declare a new class Rectangle.
// • Declare methods setValues(int, int) and getArea()
// • Create an instance of the class Rectangle
// • Calculate area of a rectangle with height=3 and weigh=4

// Calculate area of a triangle.
// • Declare a new class Triangle (no inheritance!)
// • Declare methods setValues(int, int) and getArea()
// • Define methods above outside the class
// • Create an instance of the class Triangle
// • Calculate area of a triangle with height=3 and weigh=4

// BONUS: make both classes derive from an abstract base class

// Currently Shape is an interface...
class Shape {
public:
    virtual double calcArea()=0;
};

// 2D Shape is an abstract class...
// class Shape2D {};

class Rectangle : public Shape{
private:
    double length;
    double width;
public:
    Rectangle() {
        this->length = 0;
        width = 0;
    }
    Rectangle(double x) : length(x), width(x) {}
    Rectangle(double l, double w) : length(l), width(w) {}

    // Accessors (specify const b/c they don't change anything)
    double getLength() const {return length; };
    double getWidth() const {return width; };

    // Mutators
    void setLength(double l) {
        length = l;
    }
    void setWidth(double w) {
        width = w;
    }
    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    // Methods
    double calcArea() {
        return length * width;
    }

};
typedef class Rectangle Rect;

class Triangle : public Shape{
private:
    double length;
    double width;
public:
    Triangle() : length(0), width(0) {}
    Triangle(double x) : length(x), width(x) {}
    Triangle(double l, double w) : length(l), width(w) {}

    // Accessors (specify const b/c they don't change anything)
    double getLength() const {return length; };
    double getWidth() const {return width; };

    // Mutators
    void setLength(double l) {
        length = l;
    }
    void setWidth(double w) {
        width = w;
    }
    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    // Methods
    double calcArea() {
        return length * width / 2;
    }
};
typedef class Triangle Tri;

int main() {

    Rect rect = Rectangle();
    rect.setLength(3);
    rect.setWidth(4);
    std::cout << rect.getLength() << std::endl;
    std::cout << rect.getWidth() << std::endl;
    std::cout << rect.calcArea() << std::endl;

    Tri* tri = new Tri(3, 4);
    std::cout << tri->getLength() << std::endl;
    std::cout << tri->getWidth() << std::endl;
    std::cout << tri->calcArea() << std::endl;

    delete tri;

    return 0;
}