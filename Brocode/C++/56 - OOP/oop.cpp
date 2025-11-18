#include <iostream>

class Person {
    // Defining public attributes and methods
    public:
        std::string name;
        std::string occupation;
        unsigned short age;

        void eat() {
            std::cout << "This person is eating" << std::endl;
        }
        void drink() {
            std::cout << "This person is drinking" << std::endl;
        }
        void sleep() {
            std::cout << "This person is sleeping" << std::endl;
        }
};

int main() {

    // Object = A collection of attributes and methods
    //          A pairing of various data types and the operations
    //          to work on them.
    //          Can be uesd to mimic real world items (eg. Phone, Book, Car, Dog)
    //          Created from "classes", which act as "blue-prints"

    Person person1;
    person1.name = "Spongebob";
    person1.occupation = "Frycook";
    person1.age = 30;

    Person* person2 = new Person; // "malloc"
    person2->name = "Patrick";
    person2->occupation = "Dumbass";
    person2->age = 35;

    delete person2; // "free"
    person2 = NULL;

    std::cout << person1.name << std::endl;
    std::cout << person1.occupation << std::endl;
    std::cout << person1.age << std::endl;

    return 0;
}