#include <iostream>

enum Colour {
    RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE
};

class Car {

    std::string _make;
    std::string _model;
    unsigned int _year;
    bool _isSports;
    float _kilo;
    Colour _colour;

    // Array (stack)
    std::string _destinations[10];

    // Ptr (heap), must use destructor for this
    float* _tirePreassures;

public:
    int pubVar = 0;

    static long numCars;

    // --- Constructors ---
    Car() {

    }

    Car(std::string mk, std::string md, unsigned int y, float k, Colour c) {
        _make = mk;
        _model = md;
        _year = y;
        _isSports = false;
        _kilo = k;
        _colour = c;

        _tirePreassures = new float[4];
        for (int iPreas=0; iPreas < 4; iPreas++){
            _tirePreassures[iPreas] = 37;
        }
    }

    // --- Destructors ---
    ~Car() {
        delete _tirePreassures;
    }

    // -- Getters --

    std::string getMake() {return _make;}
    std::string getModel() {return _model;}
    unsigned int getYear() {return _year;}

    // -- Setters --
    void setMake(std::string make) {
        _make = make;
    }

};

int main() {

    Car car = Car("Chevy", "Silverado", 2020, 5000, RED);

    Car car2;
    car2.setMake("Ford");
    car2.pubVar = 5;

    Car* carPtr = &car;

    return 0;
}