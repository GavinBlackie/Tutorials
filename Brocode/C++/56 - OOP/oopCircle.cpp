#include <iostream> // cout, cin, cerr, clog
#include <cmath> // pow(), sqrt()

enum Colour {
    RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE
};

class Circle{
    const float PI = 3.141592654;
    float radius; // 4 bytes
    Colour colour; // 4 bytes
    typedef Colour Color;

    public:
        void setRadius(float r) {
            radius = r;
        }

        float calcArea() {
            return PI * pow(radius, 2);
        }
};
typedef Circle Cir;

int main() {

    // Total should be = to 8 bytes!
    std::cout << "The byte size of a circle: "<< sizeof(Circle) << std::endl;

    Circle circle1 = Circle();
    circle1.setRadius(4);

    std::cout << "The area of circle1: " << circle1.calcArea() << std::endl;

    Circle* cirPtr = new Circle();

    // free(cirPtr);
    delete cirPtr;
    cirPtr = NULL;

    return 0;
}