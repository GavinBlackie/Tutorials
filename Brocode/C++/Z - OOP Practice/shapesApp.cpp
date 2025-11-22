#include <iostream>

class Shape {
private:
    int length;

public:
    Shape() : length(0) {}
    Shape(int x) : length(x) {}

    // Regular polymorphism
    virtual void draw() {
        std::cout << "Drawing this shape!" << std::endl;
    }
};

// : public Shape does NOT mean everything becomes public, it means
// that every member and operation will have public visibility AT MOST
// private and protected fields will still retain visibility
class Circle : public Shape {
public:
    Circle() : Shape() {}
    Circle(int radius) : Shape(radius) {}

    void draw() final {
        std::cout << "Drawing a circle!" << std::endl;
    }

};

class Rectangle : public Shape {
private:
    int width;
public:
    Rectangle() : width(0), Shape() {}
    Rectangle(int x) : width(x), Shape(x) {}
    Rectangle(int length, int width) : Shape(length), width(width) {}

    void draw() {
        std::cout << "Drawing a rectangle!" << std::endl;
    }
};

typedef class Rectangle Rect;




int main() {

    Shape shape1 = Shape();
    Circle circle1 = Circle(5);
    Shape* shapePtr = & circle1;
    Rect rect1(4, 8);

    shape1.draw();
    circle1.draw();
    shapePtr->draw();
    rect1.draw();
    shapePtr = & rect1;
    shapePtr->draw();


    return 0;
}

