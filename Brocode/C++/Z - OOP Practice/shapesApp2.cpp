#include <iostream>

class Shape {
public:
    virtual void draw() {
        std::cout << "Drawing this shape" << std::endl;
    }

    virtual ~Shape() {
        std::cout << "Destroying this shape obj: " << std::endl;
    }
};

class Rectangle : public Shape {
private:
    int length;
    int width;
public:
    Rectangle() : length(0), width(0) {}
    Rectangle(int x) : length(x), width(x) {}
    Rectangle(int len, int wid) : length(len), width(wid) {}

    ~Rectangle() {
        std::cout << "rectangle" << std::endl;
    }

    void draw() {
        std::cout << "Drawing this rectangle" << std::endl;
    }
};

class Square : public Rectangle {
public:
    Square() : Rectangle() {}
    Square(int x) : Rectangle(x) {}

    ~Square() {
        std::cout << "square" << std::endl;
    }
};


int main() {
    Shape shape1 = Shape();
    Rectangle rect1(10, 6);
    Square square1(5);
    shape1.draw();
    rect1.draw();
    square1.draw();


    Shape* shapePtr = &rect1;
    shapePtr->draw();

    return 0;
}